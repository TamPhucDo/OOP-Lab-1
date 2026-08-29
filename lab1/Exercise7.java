import java.util.Scanner;

public class Exercise7 {

    public static boolean isAlphaNumeric(char ch) {
        int ascii = (int) ch;

        return (ascii >= 65 && ascii <= 90) ||
               (ascii >= 97 && ascii <= 122) ||
               (ascii >= 48 && ascii <= 57);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if (isAlphaNumeric(ch)) {
            System.out.println(ch + " is alphanumeric.");
        } else {
            System.out.println(ch + " is not alphanumeric.");
        }

        scanner.close();
    }
}