/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import banco.*;

 public class Recurso extends banco.Recurso{
    private String nome;
    
    
    public Recurso(String rNome, TipoRecurso tipo, CategoriaRecurso cat){
        super(rNome, tipo.getId(), cat.getId());
        this.nome = rNome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    // banco
    
    @Override
    public void salvar(ConexaoBD banco){
        super.salvar(banco);        // salva na tabela recurso
        
    }
    
    public void excluir(ConexaoBD banco){
        banco.insert("DELETE FROM RECURSO WHERE id_recurso = '"+this.id_recurso+"'"); // exclui na tabela recurso
    }
    
 }