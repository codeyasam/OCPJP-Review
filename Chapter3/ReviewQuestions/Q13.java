/* Q13: Which of these statements can fill in the blank so that the Wildcard class compiles successfully? */

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.ArrayDeque;
import java.util.Date;

public class Q13 {
    
    public static void main(String[] args) {
        Wildcard card = new Wildcard();
        //ArrayDeque<?> list = new ArrayDeque<String>(); // compiler error - ArrayDeque<CAP#1> cannot be converted to List<?> 
        //ArrayList<? super Date> list = new ArrayList<Date>(); // will compile
        //List<?> list = new ArrayList<?>(); // compiler error - java doesn't know the type
        //List<Exception> list = new LinkedList<java.io.IOException>(); // compiler error - subclassing is not allowed in generics without the use of wildcards
        //Vector<? extends Number> list = new Vector<Integer>(); // will compile 
        card.showSize(list);
    }
    
}

class Wildcard {
    public void showSize(List<?> list) {
        System.out.println(list.size());
    }
}