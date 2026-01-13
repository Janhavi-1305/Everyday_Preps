public class Cmd_arguments {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments provided.");
        } else {
            System.out.println("Provided arguments:");
            for (String arg : args) {
                System.out.println(arg);
            }
        }
    }
}