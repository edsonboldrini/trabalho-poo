package banco;

public class TipoAtividade extends Entidade{
    private int id;
    private String nome;
    
    public TipoAtividade(int i, String n){
        super("INSERT INTO TIPO_ATIVIDADE(NOME)"
                + "VALUES ('" + n + "')");
        this.id = i;
        this.nome = n;
    }
    
    public int getId(){
        return this.id;
    }
    
    @Override
    public String toString(){
        return this.nome;
    }
}
