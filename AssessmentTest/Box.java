public class Box<T> {
    
    T value;
    
    public Box(T value) {
        this.value = value;
    }
    
    public void setValue(T value) {
        this.value = value;
    }
    
    public T getValue() {
        return value;
    }
    
    public static void main(String[] args) {
        Box<String> one = new Box<String>("String");
        Box<Integer> two = new Box<>(1);
        System.out.println(one.getValue());
        System.out.println(two.getValue());
    }
    
}