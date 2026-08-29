import java.util.Scanner;

public class Exercise4 {

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        System.out.print("enter Fahrenheit: ");
        Scanner sc = new Scanner(System.in);
        double fahrenheit=sc.nextDouble();

        System.out.println(fahrenheit + " F = "
                + fahrenheitToCelsius(fahrenheit) + " C");
        System.out.print("enter Celsius:");
        double celsius= sc.nextDouble();

        System.out.println(celsius + " C = "
                + celsiusToFahrenheit(celsius) + " F");

        sc.close();
    }
}