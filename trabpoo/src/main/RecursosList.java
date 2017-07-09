
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

