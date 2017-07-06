package main;

/**
 *
 * @author garym
 */
public class CategoriaRecurso {
    private int id;
    private String descricao;
    
    public CategoriaRecurso(int i, String d){
        this.id = i;
        this.descricao = d;
    }
    
    @Override
    public String toString(){
        return this.descricao;
    }
}
