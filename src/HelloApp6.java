public class HelloApp6 {

    public static void main(String[] args) {

        // If no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        }
        else {
            String names = "";

            // Enhanced for loop to concatenate names
            for (String name : args) {
                names += name + ", ";  // Add delimiter
            }

            // Remove the trailing comma and space using substring
            names = names.substring(0, names.length() - 2);

            // Final greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}