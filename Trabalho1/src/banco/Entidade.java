
package banco;

import main.ConexaoBD;

public abstract class Entidade {
    protected String insert;
    
    public Entidade(String i){
        this.insert = i;
    }
    
    public void setInsertString(String newString){
        this.insert = newString;
    }
    
    public void salvar(ConexaoBD banco){
        banco.insert(insert);
    }
}
