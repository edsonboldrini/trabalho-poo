
package main;

import banco.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ObFluxo extends banco.Atividade {
    private String nome;
    private TipoAtividade tipo;
    private RecursosList recursos;
    
    public ObFluxo(String n, TipoAtividade tp, RecursosList r){
        super(n, 0, tp.getId()); // só pra teste
        this.nome= n;
        this.tipo= tp;
        this.recursos=r;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public TipoAtividade getTipo(){
        return this.tipo;
    }
    
    public RecursosList getRecursos(){
        return this.recursos;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(TipoAtividade tipo) {
        this.tipo = tipo;
    }
    
    // banco
    
    
    public void salvar(ConexaoBD banco, int idModelo){
        this.id_modelo = idModelo;
        this.updateInsertString();
        
        super.salvar(banco); // salva na tabela Atividade
        ResultSet d = banco.select("SELECT ID_ATIVIDADE FROM ATIVIDADE");
        int id_atividade = 0;
        int id_categoria;
        
        try {
            ArrayList al = new ArrayList();
            while(d.next()){
                al.add(d);
            }
            id_modelo = al.size();
            
            for(Object cr : recursos){
                id_categoria = ((CategoriaRecurso)cr).getId();
                AtvRecurso ar = new AtvRecurso(id_categoria, id_atividade);
                ar.salvar(banco);
            }
        } catch (SQLException ex) {
        }
        
        // salva as relacoes entre recursos e atividades
        
    }
}