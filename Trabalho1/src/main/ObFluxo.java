
package main;

import banco.TipoAtividade;


public class ObFluxo {
    private String nome;
    private TipoAtividade tipo;
    private RecursosList recursos;
    
    public ObFluxo(String n, TipoAtividade tp, RecursosList r){
        this.nome= n;
        this.tipo= tp;
        this.recursos=r;
    }
    public ObFluxo(){
        
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public TipoAtividade getTipo(){
        return this.tipo;
    }
    
    public RecursosList getRecursos(){
        return this.recursos;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(TipoAtividade tipo) {
        this.tipo = tipo;
    }
    
}