
package main;

import banco.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

 public class Modelo extends banco.Modelo{
    private String modeloNome;
    private ObFluxoList ol;
    
    public Modelo(String mNome, ObFluxoList mOl){
        super(mNome);
        this.modeloNome= mNome;
        this.ol= mOl;
    }
    
    public String getNome(){
        return this.modeloNome;
    }
    
    public void addObjetoFluxo_pos(ObFluxo novoOb, int pos){
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
            while(d.next()){
                al.add(d);
            }
            id_modelo = al.size();
            System.out.println("modelo buscado no banco: " + id_modelo);
            
            for(ObFluxo of : ol){
                of.salvar(banco, id_modelo);
            }
        } catch (SQLException ex) {
            System.out.println("modelo select cath: " + ex.getMessage());
        }
    }
}
