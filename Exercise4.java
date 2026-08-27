public class Exercise4 {

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        double fahrenheit = 100;
        double celsius = 37;

        System.out.println(fahrenheit + " F = "
                + fahrenheitToCelsius(fahrenheit) + " C");

        System.out.println(celsius + " C = "
                + celsiusToFahrenheit(celsius) + " F");
    }
}