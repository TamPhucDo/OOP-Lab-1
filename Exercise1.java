import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your date of birth: ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("Enter your student ID: ");
        String studentId = scanner.nextLine();

        System.out.println("\n--- Student Information ---");
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Student ID: " + studentId);

        scanner.close();
    }
}