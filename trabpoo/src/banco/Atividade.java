package banco;

public class Atividade extends Entidade{
    private String nome;
    private int id_atividade;
    private int id_tipoAtividade;
    protected int id_modelo;
    
    public Atividade(String n, int idModel, int idTipo){
        super("INSERT INTO ATIVIDADE(NOME, ID_MODELO, ID_TIPOATIVIDADE)"
             + " VALUES('" + n + "'," + idModel + "," + idTipo + ");");
        this.nome= n;
        this.id_tipoAtividade= idTipo;
        this.id_modelo= idModel;
    }
    
    public Atividade(String n, int idAtiv, int idTipo, int idModel){
        this(n,idModel,idTipo);
        this.nome= n;
        this.id_atividade= idAtiv;
        this.id_tipoAtividade= idTipo;
        this.id_modelo= idModel;
    }
    
    public void updateInsertString(){
        this.insert = "INSERT INTO ATIVIDADE(NOME, ID_MODELO, ID_TIPOATIVIDADE)"
             + "VALUES ('" + this.nome + "'," + this.id_modelo + "," + this.id_tipoAtividade + ")";
    }
}
