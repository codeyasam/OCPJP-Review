/* Q8: Which of the following command lines cause this program to fail on the assertion? (Choose all that apply) */

// B. java -ea On
// C. java -da -ea: On On

class On {
    public static void main(String[] args) {
        String s = null;
        assert s != null;
    }
}