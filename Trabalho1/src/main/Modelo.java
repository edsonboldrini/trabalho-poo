
package main;

 public class Modelo {
     
    private String modeloId;
    private String modeloNome;
    private ObFluxoList ol;
    
    public Modelo(String mId, String mNome, ObFluxoList mOl){
        this.modeloId= mId;
        this.modeloNome= mNome;
        this.ol= mOl;
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
    public void alterarTipoAtividade_pos(int pos, String novoTipo){
      (this.ol).get(pos).setTipo(novoTipo);
    }  
}
