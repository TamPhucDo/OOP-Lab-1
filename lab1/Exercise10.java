import java.util.Scanner;

public class Exercise10 {

    public static int sumFirstAndLastDigit(int number) {
        number = Math.abs(number);

        int lastDigit = number % 10;

        while (number >= 10) {
            number = number / 10;
        }

        int firstDigit = number;

        return firstDigit + lastDigit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int result = sumFirstAndLastDigit(number);

        System.out.println("Sum = " + result);

        scanner.close();
    }
}