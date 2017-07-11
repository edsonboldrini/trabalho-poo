
package banco;

public class Recurso extends Entidade{
    private String nome;
    private int id_tipoRecurso;
    private int id_categoria;
    protected int id_recurso;
    
    public Recurso(String n,int idTipo, int idCat){
        super("INSERT INTO RECURSO(NOME, ID_TIPORECURSO, ID_CATEGORIA)"
                + "VALUES('"+n+"',"+idTipo+","+idCat+")");
    }
    
    public Recurso(String n, int idTipo, int idCat, int idRec){
        this(n,idTipo,idCat);
        this.nome= n;
        this.id_tipoRecurso = idTipo;
        this.id_categoria = idCat;
        this.id_recurso = idRec;
    }         
  }
