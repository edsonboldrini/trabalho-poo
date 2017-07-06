/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.LinkedList;

/**
 *
 * @author JoséGuilherme
 */
public class RecursosList extends LinkedList {
    
    @Override
    public String toString(){
        String s = "";
        for(Object o : this){
            if(o != null){
                s.concat(", ");
                s.concat(o.toString());
            }
        }
        return s;
    }
}
