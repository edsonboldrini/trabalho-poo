/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import main.ConexaoBD;

/**
 *
 * @author garym
 */
public class Modelo extends Entidade{
    private int id;
    private String Nome;
    
    public Modelo(String n){
        super("INSERT INTO MODELO (NOME) VALUES (" + n + ");");
    }
    
    public Modelo(int i, String n){
        this(n);
        this.id = i;
        this.Nome = n;
    }    
}
