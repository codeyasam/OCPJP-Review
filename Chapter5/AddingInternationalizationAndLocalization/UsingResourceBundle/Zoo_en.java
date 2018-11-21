import java.util.ResourceBundle;
import java.util.ListResourceBundle;
import java.util.Locale;

public class Zoo_en extends ListResourceBundle {
    protected Object[][] getContents() {
        return new Object[][] {
            {"hello", "Hello (java class)"},
            {"open", "The zoo is open."}
        };
    }
    
    public static void main(String[] args) {
        System.out.println(Locale.US);
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", Locale.US);
        System.out.println(rb.getObject("hello"));
    }
}
