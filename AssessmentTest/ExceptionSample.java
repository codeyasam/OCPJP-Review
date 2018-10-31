import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;

public class ExceptionSample {
    
    int sample = staticMethod();
    
    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }
    
    public void sampleMethod() {
        
        // local inner class
        class EnglishGreeting implements HelloWorld {
            public void greet() {
                
            }
            
            public void greetSomeone(String someone) {
                
            }
        }
        
        EnglishGreeting englishGreeting = new EnglishGreeting();
        
        class ChildClass extends EnglishGreeting {
            
        }
        
        //extending anonymous inner class
        HelloWorld frenchGreeting = new ChildClass() {
            
            public void greet() {
                
            }
            
            public void greetSomeone(String someone) {
                
            }
        };
        
        // interface anonymouse inner class
        HelloWorld spanishGreeting = new HelloWorld() {
            public void greet() {
                
            }
            
            public void greetSomeone(String someone) {
                
            }
        };
    }
    
    public static void main(String[] args) throws FileNotFoundException {
                ExceptionSample e = new ExceptionSample();
        System.out.println(e.sample);
        
        System.out.println("Exception.");
        File file = new File("");
        FileReader reader = new FileReader(file);
    }
    
    static class InnerClass {
       static int i; 
    }
    
    static int staticMethod() {
        System.out.println("yeah");
        return 1;
    }
}

class Sample {
    public static void main(String[] args) {
        System.out.println("Sample");
    }
}