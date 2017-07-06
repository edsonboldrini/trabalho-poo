package banco;

/**
 *
 * @author garym
 */
public class TipoAtividade extends Entidade{
    private int id;
    private String Nome;
    
    public TipoAtividade(int i, String n){
        super("SQL VAI AQUI");
        this.id = i;
        this.Nome = n;
    }
    
    @Override
    public String toString(){
        return this.Nome;
    }
}
