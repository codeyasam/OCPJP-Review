/* Q2: What is the result of compiling the following class?
*/

class Book {
    
    private int ISBN;
    private String title, author;
    private int pageCount;
    
    public int hashCode() {
        return ISBN;
    }
    
    @Override
    public boolean equals (Object obj) { 
        if (!(obj instanceof Book)) {
            return false;
        }
        Book other = (Book) obj;
        return this.ISBN == other.ISBN;
    }
    
}