/* Q10: What is the result of compiling the source file?
*/

class Book {  // compiles successfully - generates Book.class and Book$BookReader.class              
    private int pageNumber; 
    private class BookReader {
        public int getPage() {
            return pageNumber;
        }
    }
}