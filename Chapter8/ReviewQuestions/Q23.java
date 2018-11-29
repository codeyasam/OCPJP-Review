/* Q23: Assume that you have an InputStream whose next bytes are XYZABC. What is the result of calling the following method on the stream, using a count value of 3. 

public static String pullBytes(InputStream is, int count) throws IOException {
    is.mark(count);
    final StringBuilder sb = new StringBuilder();
    for (int i = 0; i < count; i++) {
        sb.append((char) is.read());
    }
    is.reset();
    is.skip(1);
    sb.append((char) is.read());
    return sb.toString();
}

* H. The result cannot be determined with the information given.
*/