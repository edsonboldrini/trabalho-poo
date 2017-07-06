
package main;

/**
 *
 * @author garym
 */
public class TipoAtividade {
    private int id;
    private String Nome;
    
    public TipoAtividade(int i, String n){
        id = i;
        Nome = n;
    }
    
    @Override
    public String toString(){
        return this.Nome;
    }
}
