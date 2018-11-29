/* Q10: The following method is designed to delete a directory tree recursively. Which of the following properties reflect the method definition? (Choose all that apply.)

public static void deleteTree(File file) {
    if (!file.isFile()) {
        for (File entry: file.listFiles()) {
            deleteTree(entry);
        }
    } else file.delete();
}

* C. It can delete a single file.
* F. It compiles but may throw an exception at runtime.
*/