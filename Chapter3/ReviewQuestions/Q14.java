/* Q14: What is the result of the following program? */

import java.util.Comparator;
import java.util.TreeSet;

public class Q14 {
    
    public static void main(String[] args) {
        Sorted s1 = new Sorted(88, "a");
        Sorted s2 = new Sorted(55, "b");
        TreeSet<Sorted> t1 = new TreeSet<>();
        t1.add(s1);
        t1.add(s2);
        TreeSet<Sorted> t2 = new TreeSet<>(s1);
        t2.add(s1);
        t2.add(s2);
        System.out.println(t1 + " " + t2); // prints [88, 55] [55, 88]
    }
    
}

class Sorted implements Comparable<Sorted>, Comparator<Sorted> {
    
    private int num;
    private String text;
    
    Sorted(int n, String t) {
        this.num = n;
        this.text = t;
    }
    
    @Override
    public String toString() {
        return "" + num;
    }
    
    @Override
    public int compareTo(Sorted s) {
        return text.compareTo(s.text);
    }
    
    @Override
    public int compare(Sorted s1, Sorted s2) {
        return s1.num - s2.num;
    }
    
}