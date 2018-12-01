/* Q20: Assuming the current directory is /seals/harp/food, what is the result of executing the following code? 

final Path path = Paths.get(".").normalize(); // h1
int count = 0;
for (int i = 0; i < path.getNameCount(); i++) {
    count++;
}

* B. 1
*/