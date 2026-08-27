import java.util.Scanner;

public class Exercise8 {

    public static int sum(int n) {
        int s = 0;

        for (int i = 1; i <= n; i++) {
            s = s + i;
        }

        return s;
    }

    public static int product(int n) {
        int p = 1;

        for (int i = 1; i <= n; i++) {
            p = p * i;
        }

        return p;
    }

    public static int sumPower(int n) {
        int s = 0;

        for (int i = 0; i <= n; i++) {
            s = s + (int) Math.pow(2, i);
        }

        return s;
    }

    public static double sumFraction(int n) {
        double s = 0;
        
        for (int i = 1; i <= n; i++) {
            s = s + 1.0 / (2 * i);
        }

        return s;
    }

    public static int sumSquare(int n) {
        int s = 0;

        for (int i = 1; i <= n; i++) {
            s = s + i * i;
        }

        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("a. Sum = " + sum(n));
        System.out.println("b. Product = " + product(n));
        System.out.println("c. Sum of powers = " + sumPower(n));
        System.out.println("d. Sum of fractions = " + sumFraction(n));
        System.out.println("e. Sum of squares = " + sumSquare(n));

        sc.close();
    }
}