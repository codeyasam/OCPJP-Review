/* Exceptions and Assertions 
*
* An exception is Java's way of saying, "I give up. I don't know what to do right now. You deal with it."

* OCP Checked Exceptions
* Exception                         Used When                  Checked or Unchecked          
* java.text.Exception               Convenient a String        checked
                                    to a number. 
* java.io.IOException               Dealing with IO            checked
* java.io.FileNotFoundException     and NIO.2 issues 
* java.io.NotSerializableException  IOException is the 
                                    parent class. There
                                    are a number of 
                                    subclasses. You 
                                    can assume any java.io
                                    exception is checked.

* java.sql.SQLException             Dealing with database      checked
                                    issues. SQLException 
                                    is the parent. Again,
                                    you can assume any 
                                    java.sql excecption is 
                                    checked

* OCP runtime exceptions
* Exception                          Used When                    Checked
* java.lang.ArrayStoreException      Trying to store the wrong    Unchecked
                                     data type in an array
* java.time.DateTimeException        Receiving an invalid format  Unchecked
                                     string for a date
* java.util.MissingResourceException Trying to access a key or    Unchecked 
                                     resource bundle that does
                                     not exist
* java.lang.IllegalStateException    Attempting to run an invalid Uncheked
* java.lang.UnsupportedException     operation in collections and
                                     concurrency
                                     
                                     
* Try Statements
* There is also a rule that says a try statement is required to have either or both of the catch and finally clauses. This is true for try statements, but is not true for try-with-resources statements, as you'll see in later in the chapter.

* Two rules in catch clauses:
* Java checks the catch blocks in the order in which they appear. It is illegal to declare a subclass exception in a catch block that is lower down in the list than a superclass exception because it will be unreachable code.

* Java will not allow you to declare a catch block for a checked exception type that cannot potentially be thrown by the try clause body. This is again to avoid unreachable code.

* extend Exception (checked) or extend RuntimeException (unchecked)

* Try-with-Resources Basics
* You might have noticed that there is no finally block in the try-with-resources code. For the OCA exam, you learned that a try statement must have one or more catch blocks or finally block. This is still true. The finally clause exists implicitly, you just don't have to type it.

* Legal vs Illegal configurations with a traditional try statement
*                           0 finally block          1 finally block               2 or more finally blocks
* 0 catch block             Not legal                legal                         Not Legal
* 1 or more catch blocks    Legal                    Legal                         Not Legal

* Legal vs Illegal configurations with a try with resource statement
* 0 catch block             Legal                   Legal                          Not Legal
* 1 or more catch blocks    Legal                   Legal                          Not Legal

* AutoCloseable  
* You can't just put any random class in a try-with-resources statement. Java requires it to implement an interface called AutoCloseable.
*/

import java.io.FileNotFoundException;

public class Main {
    
    public static void main(String[] args) {
        // multicatch
        try {
            Path path = Path.get("dolphinsBorn.txt");
            String text = new String(Files.readAllBytes(path));
            LocalDate date = LocalDate.parse(text);
            System.out.println(date);
        } catch (DateTimeParseException | IOException e) {  // the variable must only appear once in the end
            // Multi-catch is Effectively Final
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        
    }
    
    private static void sample() {
        try {
            System.out.println("sample");
        } catch(FileNotFoundException e) {
            
        }
    }
    
    private static void oldApproac(Path path1, Path path2) throws IOException {
        // Imagine that you want to write a simple method to read the first line of one file and write it to another file.
        BufferedReader in = null;
        BufferedWriter out = null;
        try {
            in = Files.newBufferedReader(path1);
            out = Files.newBufferedReader(path2);
            out.write(in.readLine());
        } finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }
    }
    
    private static void newApproach(Path path1, Path path2) throws IOException {
        try (BufferedReader in = Files.newBufferedReader(path1);
            BufferedWriter out = Files.newBufferedWriter(path2)) {
            out.write(in.readLine());  // automatic resource management
        }
    }
    
    
}