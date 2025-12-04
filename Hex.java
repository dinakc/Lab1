public class Hex {

    /**
     * Main method that accepts a single hex argument and converts it.
     * @param args Command line argument: expected 1 hex string.
     */
    public static void main(String[] args) {

        if (args.length != 1) {
            System.err.println("Error: Please provide exactly one hexadecimal argument.");
            System.exit(1);
        }

        String hex = args[0];

        // Validate characters
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);

            boolean isDigit = (c >= '0' && c <= '9');
            boolean isUpperHex = (c >= 'A' && c <= 'F');
            boolean isLowerHex = (c >= 'a' && c <= 'f');

            if (!(isDigit || isUpperHex || isLowerHex)) {
                System.err.println("Error: Invalid hexadecimal character '" + c + "'");
                System.exit(2);
            }
        }

        // Manual conversion
        long decimal = 0;
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int value;

            if (c >= '0' && c <= '9') {
                value = c - '0';
            } else if (c >= 'A' && c <= 'F') {
                value = 10 + (c - 'A');
            } else {
                value = 10 + (c - 'a');
            }

            decimal = decimal * 16 + value;
        }

        System.out.println(decimal);
    }
}