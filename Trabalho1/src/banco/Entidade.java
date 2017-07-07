
package banco;

import main.ConexaoBD;

public abstract class Entidade {
    private final String insert;
    
    public Entidade(String i){
        this.insert = i;
    }
    
    public void salvar(ConexaoBD banco){
        banco.insert(insert);
    }
}
