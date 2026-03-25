public class HelloApp5 {


    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {

        // Check if no command-line arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        }
        else {
            // Enhanced for loop (for-each) to iterate through all names
            for (String name : args) {
                greet(name); // Call method for each name
            }
        }
    }
}