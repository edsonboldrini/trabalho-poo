package banco;

/**
 *
 * @author garym
 */
public class TipoAtividade extends Entidade{
    private int id;
    private String Nome;
    
    public TipoAtividade(int i, String n){
        super("INSERT INTO TIPO_ATIVIDADE(NOME)"
                + "VALUES (" + n + "n"+")");
        this.id = i;
        this.Nome = n;
    }
    
    public int getId(){
        return this.id;
    }
    
    @Override
    public String toString(){
        return this.Nome;
    }
}
