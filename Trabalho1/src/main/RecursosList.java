
package main;

<<<<<<< HEAD
import java.util.ArrayList;

public class RecursosList extends ArrayList{
=======
import java.util.LinkedList;

/**
 *
 * @author JoséGuilherme
 */
public class RecursosList extends LinkedList {
>>>>>>> af76bc05939f66d275d7a83c43f9a758782ac222
    
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

