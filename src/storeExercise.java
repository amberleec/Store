import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
import java.io.PrintStream;

/**
 * Created by
 * Amberlee on 5/15/17.
 */

public class storeExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);
        String menu = "y", repeat, name = "", receipt = "", item = "";
        double total = 0, price = 0;
        int quantity, itemNo = 1;

        // While loop for the Switch case
        name = userName(input, out);
        while (menu.equalsIgnoreCase("y")) {
            displayMenu(out);
            switch (options(input, out)) {
                case 1:
                    // While loop for adding items
                    do {
                        item = userItem(input, out);
                        price = userPrice(input, out);
                        quantity = userQuantity(input, out);
                        receipt += "\n " + itemNo + ") " + quantity + " x " + item + " " + amount(price);
                        total += quantity * price;
                        itemNo++;
                        repeat = recursion(input, out);
                    } while (repeat.equalsIgnoreCase("y"));
                    break;
                case 2:
                    // Receipt visuals
                    System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
                    receipt += "\n\nTotal: " + amount(total);
                    System.out.println(receipt);
                    System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
                    break;
                case 3:
                    System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
                    System.out.println("Thank you, " + name + " for shopping with us day!");
                    receipt += "\n\nTotal: " + amount(total);
                    System.out.println(receipt);
                    System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
                    System.exit(0);
                default:
                    System.out.println("Invalid! Please select between 1-3!");
            }
            System.out.println("Would you like to return to the menu? y/n");
            menu = input.next();
        }
        System.out.println("Thank you for shopping with us!");
    }

    public static String userName(Scanner input, PrintStream out) {
        System.out.println("What is your name?");
        String name = input.next();
        System.out.println("*+*+*+* Welcome to A&J " + name + " *+*+*+*");
        return name;
    }

    public static void displayMenu(PrintStream out) {
        System.out.println("Please choose an option!");// display there name after hello
        System.out.println("1) Sale");
        System.out.println("2) Check Cart");
        System.out.println("3) Print Receipt");
    }

    public static int options(Scanner input, PrintStream out) {
        int option = input.nextInt();
        input.nextLine();
        return option;
    }

    public static String userItem(Scanner input, PrintStream out) {
        System.out.println("What would you like to buy?");
        return input.next();
    }

    public static double userPrice(Scanner input, PrintStream out) {
        System.out.println("What is the price?");
        return input.nextDouble();

    }

    public static String recursion(Scanner input, PrintStream out) {
        System.out.println("Would you like another item? y/n");
        return input.next();
    }

    public static int userQuantity(Scanner input, PrintStream out) {
        System.out.println("How many would you like to buy?");
        int quantity = input.nextInt();
        input.nextLine();
        return quantity;
    }

    public static String amount(double number) {
        return "$" + String.format("%,.2f", number);
    }

}
