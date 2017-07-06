package banco;

import main.ConexaoBD;

/**
 *
 * @author garym
 */
public class CategoriaRecurso extends Entidade{
    private int id;
    private String descricao;
    
    public CategoriaRecurso(int i, String d){
        super("INSERT INTO CATEGORIA_RECURSO(DESCRICAO)"
              + "VALUES(" + d + ")");
        this.id = i;
        this.descricao = d;
    }
    
    public int getId(){
        return this.id;
    }
    
    @Override
    public String toString(){
        return this.descricao;
    }
}
