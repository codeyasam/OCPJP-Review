/* Q15: Assuming zoo-data.txt is a multiline text file, what is true of the following method? 
*
private void echo() throws IOException {
    try (FileReader fileReader = new FileReader("zoo-data.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader)) {
        System.out.println(bufferedReader.readLine());    
    }
}

* A. It prints the first line of the file to the console.
*/