import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();

        while (n != 1) {
            if (n % 2 == 0) {
                int next = n / 2;
                System.out.println(n + " is even, so we take n/2: " + next);
                n = next;
            } else {
                int next = 3 * n + 1;
                System.out.println(n + " is odd, so we take 3*n+1: " + next);
                n = next;
            }
        }

        sc.close();
    }
}