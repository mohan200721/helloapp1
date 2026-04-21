public class HelloApp {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        StringBuilder message = new StringBuilder();
        boolean first = true;

        for (String name : args) {
            if (!first) {
                message.append(", ");
            }
            message.append(name);
            first = false;
        }

        System.out.println("Hello, " + message + "!");
    }
}