
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
                s = s.concat(o.toString());
                s = s.concat(", ");
            }
        }
        return s;
    }
}

