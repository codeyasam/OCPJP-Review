import java.util.List;
import java.util.ArrayList;
import static java.util.Collections.sort;

/*
    two ways to import sort static method of Collections
    import static java.util.Collections.sort; 
    //or
    import static java.util.Collections.*;
    
    two ways to import List and ArrayList
    import java.util.List;
    import java.util.ArrayList;
    //or
    import java.util.*;
    
*/

class ListHelper {
    
    public List<String> copyAndSortList(List<String> original) {
        List<String> list = new ArrayList<String>(original);
        sort(list);
        return list;
    }
    
}