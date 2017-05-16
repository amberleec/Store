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
        String menu = "y", repeate = "y", receipt = "", item = "";
        double total = 0, price = 0;
        int quantity, itemNo = 1;


        while (menu.equalsIgnoreCase("y")) {
            displayMenu(input, out);
            switch (options(input, out)) {
                case 1:
                    while (repeate.equalsIgnoreCase("y")) {
                        item = userItem(input, out);
                        price = userPrice(input, out);
                        quantity = userQuantity(input, out);
                        receipt += "\n " + itemNo + ") " + quantity + " x " + item + " " + amount(price);
                        total += quantity * price;
                        itemNo++;
                        repeate = recursion(input, out);
                    }
                    break;
                case 2:
                    System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
                    System.out.println("Thank you for shopping with our store. We will see you next time!");
                    receipt += "\n\nTotal: " + amount(total);
                    System.out.println(receipt);
                    break;
                case 3:
                    System.out.println("Thank you! Have a good day!");
                    System.exit(0);
                default:
                    System.out.println("Invalid! Please select between 1-3!");
            }
            System.out.println("Would you like to return to the menu? y/n");
            menu = input.next();
        }
        System.out.println("Thank you for shopping with us!");
    }

    public static void displayMenu(Scanner input, PrintStream out) {
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("****Welcome to our store " + name + "****");
        System.out.println(name + ", please choose an option!");// display there name after hello
        System.out.println("1) Sale");
        System.out.println("2) Receipt");
        System.out.println("3) Exit");
    }

    public static String name(Scanner input, PrintStream out) {
        System.out.println("What is your name?");
        return input.nextLine();
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
