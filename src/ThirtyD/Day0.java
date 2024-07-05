import java.util.Scanner;

public class Day0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a line of text from the console
        String s = scanner.nextLine();

        // Display the output
        System.out.println("Hello, World.");
        System.out.println(s);

        // Close the Scanner to avoid resource leaks
        scanner.close();
    }
}
