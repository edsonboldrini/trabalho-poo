/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author edson
 */

public class AtvRecurso extends Entidade{
    private int idCategoria;
    private int idAtividade;
    
    public AtvRecurso(int idCategoria, int idAtividade){
        super("INSERT INTO ATIVIDADE_RECURSO(ID_CATEGORIA,ID_ATIVIDADE)"
                + "VALUES("+idCategoria+","+idAtividade + ")");
    }
}
