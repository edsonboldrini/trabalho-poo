/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author garym
 */
public abstract class Entidade {
    private final String insert;
    
    public Entidade(String i){
        this.insert = i;
    }
    
    public void salvar(ConexaoBD banco){
        banco.insert(insert);
    }
}
