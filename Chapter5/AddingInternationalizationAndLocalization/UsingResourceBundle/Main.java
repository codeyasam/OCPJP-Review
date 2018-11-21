/* Using Resource Bundle 
*
* A resource bundle contains the local specific objects to be used by a program. It is like a map with keys and values.
*/

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.Properties;
import java.util.ListResourceBundle;
import java.text.MessageFormat;

public class Main {
    
    public static void main(String[] args) {
        Locale us = new Locale("en", "US");
        Locale france = new Locale("fr", "FR");
        Locale englishCanada = new Locale("en", "CA");
        Locale frenchCanada = new Locale("fr", "CA");
        
        printProperties(us);
        System.out.println();
        printProperties(france);
        
        Locale locale = new Locale("en", "CA");
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
        System.out.print(rb.getString("hello"));
        System.out.print(", ");
        System.out.print(rb.getString("name"));
        System.out.print(" ");
        System.out.print(rb.getString("open"));
        System.out.print(" ");
        System.out.print(rb.getString("visitor"));
        
        String format = rb.getString("helloByName");
        String formatted = MessageFormat.format(format, "Tammy");
        System.out.println(formatted);
    }
    
    public static void printProperties(Locale locale) {
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("open"));
        
        Set<String> keySet = rb.keySet();
        keySet.stream().map(k -> k + " " + rb.getString(k))
            .forEach(System.out::println);
            
        Properties props = new Properties();
        keySet.stream().forEach(k -> props.put(k, rb.getString(k)));
        
        System.out.println(props.getProperty("notReallyAProperty"));
        System.out.println(props.getProperty("notReallyAProperty", "123"));
    }
    
}

