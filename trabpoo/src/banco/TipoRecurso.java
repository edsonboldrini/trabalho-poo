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
public class TipoRecurso extends Entidade {
    private int id;
    private String nome;
    
    public TipoRecurso(int i, String n){
        super("INSERT INTO TIPO_RECURSO(NOME)"
                + "VALUES ('" + n + "')");
        this.id = i;
        this.nome = n;
    }
    
    public int getId(){
        return this.id;
    }

    @Override
    public String toString() {
        return this.nome;
    }
 
}
