public class HelloAppUC7 {
    public static void main(String[] args) {

        // Case 1: No arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        // Case 2: Arguments present
        else {
            String names = String.join(", ", args);
            System.out.println("Hello, " + names + "!");
        }
    }
}
