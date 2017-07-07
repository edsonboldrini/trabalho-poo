/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> parent of 4e0190a... atualizando
=======
>>>>>>> parent of 4e0190a... atualizando
/**
 *
 * @author edson
 */
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
public class AtvRecurso {
    
>>>>>>> parent of 4e0190a... atualizando
=======
public class AtvRecurso {
    
>>>>>>> parent of 010e8c9... merge
=======
public class AtvRecurso {
    
>>>>>>> parent of 4e0190a... atualizando
}
