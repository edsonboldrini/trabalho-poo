
package banco;

<<<<<<< HEAD
/**
 *
 * @author edson
 */
public class AtvRecurso extends Entidade {

    public AtvRecurso(int id_categoria, int id_atividade) {
        super("SQL aqui");
=======
public class AtvRecurso extends Entidade{
    private int idCategoria;
    private int idAtividade;
    
    public AtvRecurso(int idCategoria, int idAtividade){
        super("INSERT INTO ATIVIDADE_RECURSO(ID_CATEGORIA,ID_ATIVIDADE)"
                + "VALUES("+idCategoria+","+idAtividade);
>>>>>>> 8972ad4998592904a2cf80b99b6472bba0d7c78d
    }
}
