/* Picking a Locale 
*
* Oracle defines a locale as "a specific geographical, political and cultural region", you'll only see languages and countries on the exam.
* The Locale class is in java.util package
*/

import java.util.Locale;

public class Main {
    
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale);  // en_US 
        // first comes the lowercase language code. Then comes an underscore followed by the uppercase country code.
        // the underscore and country code are optional. It is valid for a Locale to be only a language.
        
        System.out.println(Locale.GERMAN);
        System.out.println(Locale.GERMANY);
    
        System.out.println(new Locale("fr"));
        System.out.println(new Locale("hi", "IN"));
        
        Locale l1 = new Locale.Builder()
            .setLanguage("en")
            .setRegion("US")
            .build();
        
        Locale l2 = new Locale.Builder()
            .setRegion("US")
            .setLanguage("en")
            .build();
        
        
        System.out.println(Locale.getDefault());
        Locale locale1 = new Locale("fr");
        Locale.setDefault(locale1);
        System.out.println(Locale.getDefault());
    }
    
}