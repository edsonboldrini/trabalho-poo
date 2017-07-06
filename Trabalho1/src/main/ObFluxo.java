
package main;


public class ObFluxo {
    private String nome;
    private String id;
    private String tipo;
    private RecursosList recursos;
    
    public ObFluxo(String n, String i, String tp, RecursosList r){
        this.nome= n;
        this.id=i;
        this.tipo= tp;
        this.recursos=r;
    }
    public ObFluxo(){
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}