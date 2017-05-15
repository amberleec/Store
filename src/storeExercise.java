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
        String menu = "y",receipt = "",item = "";
        double total = 0, price = 0;
        int quantity,itemNo = 1;




        displayMenu(out);
        switch(options(input,out)){
            case 1:
                item = userItem(input, out);
                price = userPrice(input, out);
                quantity = userQuantity(input, out);
                receipt += "\n" + itemNo + "." + quantity + "x" + item + " " + amount(price);
                total += quantity * price;
                itemNo++;
                break;
            case 2:
                System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
                System.out.println("Thank you for shopping with our store. We will see you next time!");
                break;
            case 3:
                System.out.println("Thank you! Have a good day!");
                System.exit(0);
            default:
                System.out.println("Invalid! Please select between 1-3!");

        }

        System.out.println("Would you like to return to the menu? y/n");
        menu = input.nextLine();


    }

    public static void displayMenu(PrintStream out){
//        System.out.println("What is your name?");
//        String name = input.nextLine();
        System.out.println("****Welcome to our store****");
        System.out.println("Hello please choose an option!");// display there name after hello
        System.out.println("1) Sale");
        System.out.println("2) Receipt");
        System.out.println("3) Exit");

    }

    public static String name(Scanner input,PrintStream out) {
        System.out.println("What is your name?");
        return input.nextLine();
    }

    public static int options(Scanner input,PrintStream out){
        int option = input.nextInt();
        input.nextLine();
        return option;
    }

    public static String userItem(Scanner input,PrintStream out){
        System.out.println("What item would you like to buy?");
        return input.nextLine();
    }

    public static double userPrice(Scanner input,PrintStream out){
        System.out.println("How much is the price for that item?");
        return input.nextDouble();

    }

    public static int userQuantity(Scanner input,PrintStream out){
        System.out.println("How many would you like to buy?");
        int quantity = input.nextInt();
        input.nextLine();
        return quantity;
    }

    public static String amount(double number){
        return "$" + String.format("%,.2f",number);
    }

}
