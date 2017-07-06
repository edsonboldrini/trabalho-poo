package banco;

/**
 *
 * @author garym
 */
public class TipoAtividade {
    private int id;
    private String Nome;
    
    public TipoAtividade(int i, String n){
        this.id = i;
        this.Nome = n;
    }
    
    @Override
    public String toString(){
        return this.Nome;
    }
}
