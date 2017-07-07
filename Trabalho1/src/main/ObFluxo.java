
package main;

import banco.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ObFluxo extends banco.Atividade {
    private String nome;
    private TipoAtividade tipo;
    private RecursosList recursos;
    
    public ObFluxo(String n, TipoAtividade tp, RecursosList r){
        this.nome= n;
        this.tipo= tp;
        this.recursos=r;
    }
    
    public ObFluxo(){
        
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
    
    @Override
    public void salvar(ConexaoBD banco) throws SQLException{
        super.salvar(banco); // salva na tabela Atividade
        ResultSet d = banco.select("SELECT ID_ATIVIDADE FROM ATIVIDADE");
        d.last();
        int id_atividade = d.getInt("ID_Atividade");
        int id_categoria;
        // salva as relacoes entre recursos e atividades
        for(CategoriaRecurso cr : recursos){
            id_categoria = ((CategoriaRecurso)cr).getId();
            Atividade_Recurso ar = new Atividade_Recurso(id_categoria, id_atividade);
            ar.salvar();
        }
    }
}