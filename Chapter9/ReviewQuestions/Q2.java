/* Q2: For which values of path inserted on the blank line would it be possible for the following code to output Success? (Choose all that apply.) 

Path path = __________;
if (Files.isDirectory(path)) {
    System.out.println(Files.deleteIfExists(path) ? "Success": "Try Again");
}

* B. path refers to a symbolic link in the file system.
* C. path refers to an empty directory in the file system.
*/