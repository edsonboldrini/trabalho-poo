/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import banco.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

 public class Recurso extends banco.Recurso{
    private String nome;
    
    
    public Recurso(String rNome, int idTipo, int idCat){
        super(rNome, idTipo, idCat);
        this.nome = rNome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    // banco
    
    @Override
    public void salvar(ConexaoBD banco){
        super.salvar(banco);        
    }
 }