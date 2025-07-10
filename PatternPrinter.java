import java.util.Scanner;

public class PatternPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int n = scanner.nextInt();

        // Loop through rows
        for (int i = 1; i <= n; i++) {
            // Print 'x' characters (n - i times)
            for (int j = 1; j <= n - i; j++) {
                System.out.print("x");
            }

            // Print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Move to next line
            System.out.println();
        }

        scanner.close();
    }
}