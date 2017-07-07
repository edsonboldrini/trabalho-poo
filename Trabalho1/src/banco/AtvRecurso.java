
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
<<<<<<< HEAD
                + "VALUES("+idCategoria+","+idAtividade + ")");
=======
                + "VALUES("+idCategoria+","+idAtividade);
>>>>>>> 8972ad4998592904a2cf80b99b6472bba0d7c78d
>>>>>>> 9ea09191e8204a3ae973b1490e535d68620f0887
    }
}
