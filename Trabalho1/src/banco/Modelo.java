
package banco;

public class Modelo extends Entidade{
    private int id;
    private String Nome;
    
    public Modelo(String n){
        super("INSERT INTO MODELO (NOME) VALUES (" + n + ");");
    }
    
    public Modelo(int i, String n){
        this(n);
        this.id = i;
        this.Nome = n;
    }    
}
