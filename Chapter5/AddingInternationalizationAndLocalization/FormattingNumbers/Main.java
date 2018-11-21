/* Formatting Numbers 
* 
* Resource bundles are great for content that doesn't change. Text like a welcome greeting is pretty stable. When talking about dates
* and prices, the formatting varies and not just the text.

* java.text package

* Format and parse Numbers and Currency
* You need to create NumberFormat
* Factory methods to get a NumberFormat
* Description                                    Using Default Locale and a Specified Locale
* A general purpose formatter                    NumberFormat.getInstance(); 
                                                 NumberFormat.getInstance(locale);
* Same as getInstance                            NumberFormat.getNumberInstance();
                                                 NumberFormat.getNumberInstance(locale);
* For formatting monetary amounts                NumberFormat.getCurrencyInstance();
                                                 NumberFormat.getCurrencyInstance(locale);
* For formatting percentages                     NumberFormat.getPercentInstance();
                                                 NumberFormat.getPercentInstance(locale);
* Rounds decimal values before displaying        NumberFormat.getIntegerInstance();
                                                 NumberFormat.getIntegerInstance(locale);
* Once you have a number format you can call format() to turn a number into a String and parse() to turn String into a number.
* format classes are not thread-safe. Do not store them in instance variables or static variables
*/

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Main {
    
    public static void main(String[] args) throws ParseException {
        int attendeesPerYear = 3_200_000;
        int attendeesPerMonth = attendeesPerYear / 12;
        NumberFormat us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(attendeesPerMonth));
        NumberFormat g = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(g.format(attendeesPerMonth));
        NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println(ca.format(attendeesPerMonth));
        
        // for currency
        double price = 48; // always use big decimal for monetary values
        NumberFormat format = NumberFormat.getCurrencyInstance();
        System.out.println(format.format(price));
        
        // parsing
        NumberFormat en = NumberFormat.getInstance(Locale.US);
        NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);
        
        String s = "40.45";
        System.out.println(en.parse(s)); // 40.45
        System.out.println(fr.parse(s)); // 40 
        // france does not use a decimal point to separate numbers.
        
        String amt = "$92,807.99";
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        System.out.println(cf.parse(amt));
        
        
        // What does java do with Extra Charactrs When parsing
        // The parse method parses only the begining of a String. After i reaches a character that cannot be parsed, the parsing stops and the value is returned. 
        
        NumberFormat nf = NumberFormat.getInstance();
        String one = "456abc";
        String two = "-2.5165x10";
        String three = "x85.3";
        System.out.println(nf.parse(one)); // 456
        System.out.println(nf.parse(two)); // -2.5165
        System.out.println(nf.parse(three)); // throws ParseException
        
        
    }
    
}