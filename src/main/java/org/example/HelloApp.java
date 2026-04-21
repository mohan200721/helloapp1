public class HelloApp {
    public static void main(String[] args) {

        // If no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        StringBuilder nameBuilder = new StringBuilder();

        // Step 1: Add ALL names with comma
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // Step 2: Remove last ", "
        if (nameBuilder.length() > 0) {
            nameBuilder = new StringBuilder(
                    nameBuilder.substring(0, nameBuilder.length() - 2)
            );
        }

        // Step 3: Print
        System.out.println("Hello, " + nameBuilder + "!");
    }
}