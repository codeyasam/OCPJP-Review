/* Q10: What is correct about the following code snippet? (Choose all that apply.) 

Files.move(Paths.get("monkey.txt"), Paths.get("/animals),
    StandardCopyOption.ATOMIC_MOVE, 
    LinkOption.NOFOLLOW_LINKS);
    
* C. If another process is monitoring the file system, it will not see an incomplete file at runtime.
* E. The metadata of the monkey.txt will be moved along with the file.
*/