package banco;

public class Processo extends Entidade {
    private int id;
    private int idModelo;
    private String nome;
    
    public Processo(int idModelo, String nome){
        super("INSERT INTO PROCESSO(ID_MODELO,NOME)"
                + "VALUES("+idModelo+","+nome +")");
        
    }
    public Processo(int id, int idModelo, String nome){
        this(idModelo,nome);
        this.id= id;
        this.idModelo= idModelo;
        this.nome= nome;
        
    }
}
