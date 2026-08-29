import java.util.Scanner;

public class Exercise3 {

    public static int getRemainder(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        if (b != 0) {
            System.out.println("Remainder: " + getRemainder(a, b));
        } else {
            System.out.println("Cannot divide by zero.");
        }

        scanner.close();
    }
}