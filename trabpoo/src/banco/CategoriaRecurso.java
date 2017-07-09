package banco;

public class CategoriaRecurso extends Entidade{
    private int id;
    private String descricao;
    
    public CategoriaRecurso(String d){
            super("INSERT INTO CATEGORIA_RECURSO(DESCRICAO)"
              + "VALUES('" + d + "')");
    }
    public CategoriaRecurso(int i, String d){
        this(d);
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
