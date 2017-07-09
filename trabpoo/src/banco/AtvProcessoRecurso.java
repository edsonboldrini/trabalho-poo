package banco;

public class AtvProcessoRecurso extends Entidade {
    private final int idRecurso;
    private final int idAtividadeProcesso;
    
    public AtvProcessoRecurso(int idRecurso,int idAtividadeProcesso){
        super("INSERT INTO ATVPROCESSO_RECURSO(ID_RECURSO,ID_ATVPROCESSO)"
                + "VALUES("+ idRecurso + "," + idAtividadeProcesso + ")");
        
        this.idAtividadeProcesso=idAtividadeProcesso;
        this.idRecurso= idRecurso;
    }  
}
