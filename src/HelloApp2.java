public class HelloApp2 {
    public static void main(String[] args) {

        // Check if an argument is provided
        if (args.length > 0) {
            String name = args[0];   // Read the first argument
            System.out.println("Hello, " + name + "!");
        } 
        else {
            System.out.println("Please provide a name as a command-line argument.");
        }
    }
}