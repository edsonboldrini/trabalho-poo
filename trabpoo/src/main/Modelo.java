
package main;

import banco.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

 public class Modelo extends banco.Modelo{
    private String modeloNome;
    private AtividadeList ol;
    
    public Modelo(String mNome, AtividadeList mOl){
        super(mNome);
        this.modeloNome= mNome;
        this.ol= mOl;
    }
    
    public String getNome(){
        return this.modeloNome;
    }
    
    public void addObjetoFluxo_pos(Atividade novoOb, int pos){
        this.ol.add(pos, novoOb);
    } 
    public void removeObjetoFluxo_pos(int pos){
        this.ol.remove(pos);
    }
    public void alterarNomeAtividade_pos(int pos, String novoNome){   
        this.ol.get(pos).setNome(novoNome);
    }
    public void alterarTipoAtividade_pos(int pos, TipoAtividade novoTipo){
        this.ol.get(pos).setTipo(novoTipo);
    }
    
    // banco
    
    @Override
    public void salvar(ConexaoBD banco){
        super.salvar(banco);// salva na tabela modelo
        // salvar atividades na tabela atividade
        ResultSet d = banco.select("SELECT ID_MODELO FROM MODELO");
        int id_modelo;
        
        try {
            ArrayList al = new ArrayList();
            while(d.next()){                // Transfere o set para um arraylist
                al.add(d);
            }
            //
            //int lastindex = al.size();      // Pega o tamanho do arraylist
            //d = (ResultSet)al.get(lastindex);// usa o tamanho do arraylist para pegar o ultimo elemento
            //id_modelo = d.getInt("id_modelo");// Pega o indice do ultimo elemento
            id_modelo = al.size();
            for(Atividade of : ol){
                of.salvar(banco, id_modelo);
            }
        } catch (SQLException ex) {
            System.out.println("modelo select cath: " + ex.getMessage());
        }
    }
}
