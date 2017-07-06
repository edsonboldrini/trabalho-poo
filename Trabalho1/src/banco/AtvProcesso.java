
package banco;
public class AtvProcesso extends Entidade{
    private int id;
    private String terminado;
    private String dataInicio;
    private String dataFim;
    private int idAtividade;
    private int idProcesso;
    
    
    public AtvProcesso(String terminado, String dataInicio, String dataFim, int idAtividade, int idProcesso){
        super("INSERT INTO ATVPROCESSO(TERMINADO, DATAINICIO, DATAFIM, IDATIVIDADE, IDPROCESSO"
                + "VALUES (" + terminado +","+ dataInicio +","+ dataFim +","+ idAtividade +","+ idProcesso);
        
    }
    
    public AtvProcesso(int idOb, String terminado, String dataInicio, String dataFim, int idAtividade, int idProcesso){
        
        this(terminado,dataInicio,dataFim,idAtividade, idProcesso);
        this.id= idOb;
        this.terminado= terminado;
        this.dataInicio= dataInicio;
        this.dataFim= dataFim;
        this.idAtividade= idAtividade;
        this.idProcesso= idProcesso;
        
    }
    
}
