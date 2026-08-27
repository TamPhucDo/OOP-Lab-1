import java.util.Scanner;

public class Exercise11 {

    public static int countDigits(int n) {
        int count = 0;

        if (n == 0) {
            return 1;
        }

        
        n = Math.abs(n);

        while (n > 0) {
            n = n / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Number of digits: " + countDigits(n));

        sc.close();
    }
}