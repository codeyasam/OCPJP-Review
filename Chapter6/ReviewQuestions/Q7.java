/* Q7: What is the result of running java EchoInput hi there with the following code? */

// C. The code throws an ArrayIndexOutOfBoundsException

class EchoInput {
    public static void main(String[] args) {
        if (args.length <= 3) assert false;
        System.out.println(args[0] + args[1] + args[2]);
    }
}