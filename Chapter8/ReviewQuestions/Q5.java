/* Q5: What is the result of executing the following code? (Choose all that apply.) 

String line;
Console c = System.console();
Writer w = c.writer();
if ((line = c.readLine()) != null)
    w.append(line);
w.flush();

* B. The code prints what was entered by the user.
* D. A NullPointerException might be thrown.
* E. An IOException might be thrown.
*/

import java.io.Console;
import java.io.Writer;
import java.io.IOException;

public class Q5 {
    
    public static void main(String[] args) throws IOException {
        String line;
        Console c = System.console();
        Writer w = c.writer();
        if ((line = c.readLine()) != null)
            w.append(line);
        w.flush();
    }
    
}