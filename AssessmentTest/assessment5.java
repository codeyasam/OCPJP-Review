import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

class AssessmentFive {
    
    public static void main(String[] args) {
        System.out.println("working");
        
        // own testing
        List<Integer> myIntegers = Arrays.asList(1, 2, 3, 4);
        // myIntegers.add(4); will throw an UnsupportedException since it is not an instance of ArrayList which support mutable list 
        System.out.println(myIntegers);
        
        List<Integer> source = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> fish = new CopyOnWriteArrayList<>(source);
        List<Integer> mammals = Collections.synchronizedList(source);
        Set<Integer> birds = new ConcurrentSkipListSet<>();
        birds.addAll(source);
        
//        for (Integer m: mammals) System.out.println(m);  // This would be fine
//        int size = mammals.size();   
//        for (int i = 0; i < size; i++) {   // This also would be fine
//            mammals.add(mammals.get(i));
//        }

        
        synchronized(new Integer(10)) {
            for (Integer f: fish) {
                fish.add(4); //c1
            }
            
            for (Integer m: mammals) mammals.add(4); //c2 will cause ConcurrentModificationError because of synchronizedList
            for (Integer b: birds) birds.add(5);
            System.out.println(fish.size() + " " + mammals.size() + " " + birds.size());
        }
    }
    
}