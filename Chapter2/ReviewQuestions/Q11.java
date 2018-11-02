/* Q11: Which lambda can replace the MySecret class to return the same value?
*
* caller((e) -> "Poof");
* caller((e) -> { String f = ""; return "Poof"; });
*/

interface Secret {
    String magic(double d);
}

class MySecret implements Secret {
    public String magic(double d) {
        return "Poof";
    }
}