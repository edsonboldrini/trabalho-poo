
package banco;

public class TipoRecurso extends Entidade {
    private int id;
    private String nome;
    
    public TipoRecurso(String n){
        super("INSERTO INTO TIPO_RECURSO (NOME)"
                + "VALUES ("+n+")");
    }
    public TipoRecurso(int id, String n){
        this(n);
        this.id= id;
        this.nome= n;
    }
}
