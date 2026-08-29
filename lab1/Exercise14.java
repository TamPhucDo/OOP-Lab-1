import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = 0;
        double money;

        while (choice != 5) {

            System.out.println("----Menu----");
            System.out.println("1. Coca");
            System.out.println("2. Pepsi");
            System.out.println("3. Sprite");
            System.out.println("4. Snack");
            System.out.println("5. Shutdown Machine");

            System.out.print("Please enter the number: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("The price of Coca is 2$, please enter the amount of money: ");
                    money = sc.nextDouble();

                    if (money >= 2) {
                        System.out.println("Your change is " + (money - 2) + "$.");
                    } else {
                        System.out.println("Not enough money to buy this item. Please select again.");
                    }
                    break;

                case 2:
                    System.out.print("The price of Pepsi is 2$, please enter the amount of money: ");
                    money = sc.nextDouble();

                    if (money >= 2) {
                        System.out.println("Your change is " + (money - 2) + "$.");
                    } else {
                        System.out.println("Not enough money to buy this item. Please select again.");
                    }
                    break;

                case 3:
                    System.out.print("The price of Sprite is 2$, please enter the amount of money: ");
                    money = sc.nextDouble();

                    if (money >= 2) {
                        System.out.println("Your change is " + (money - 2) + "$.");
                    } else {
                        System.out.println("Not enough money to buy this item. Please select again.");
                    }
                    break;

                case 4:
                    System.out.print("The price of Snack is 3$, please enter the amount of money: ");
                    money = sc.nextDouble();

                    if (money >= 3) {
                        System.out.println("Your change is " + (money - 3) + "$.");
                    } else {
                        System.out.println("Not enough money to buy this item. Please select again.");
                    }
                    break;

                case 5:
                    System.out.println("Shutdown Machine");
                    break;

                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }

        sc.close();
    }
}