public class CommandInjection {
    public static void main(String[] args) throws Exception {
        String userInput = args[0];
        Runtime.getRuntime().exec(userInput);
    }
}
