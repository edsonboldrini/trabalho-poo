
package banco;

public class AtvRecurso extends Entidade{
    private int idCategoria;
    private int idAtividade;
    
    public AtvRecurso(int idCategoria, int idAtividade){
        super("INSERT INTO ATIVIDADE_RECURSO(ID_CATEGORIA,ID_ATIVIDADE)"
                + "VALUES("+idCategoria+","+idAtividade + ")");
        this.idCategoria = idCategoria;
        this.idAtividade = idAtividade;
    }
}
