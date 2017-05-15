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


        displayMenu(out);
        switch(options(input,out)){
            case 1:
                item = items(input, out);
                price = price(input, out);
                quantity = askQuantity(input, out);
                break;
            case 2:
                System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
                System.out.println("Thank you for shopping with our store");

        }


    }

    public static void displayMenu(PrintStream out){

        System.out.println("****Welcome to our store****");
        System.out.println("What is your name?");
        System.out.println("Hello");// display there name after hello
        System.out.println("1) Sale");
        System.out.println("2) Receipt");
        System.out.println("3) Exit");

    }

    public static int options(Scanner input,PrintStream out){
        int option = input.nextInt();
        input.nextLine();
        return option;
    }

    public static String items(Scanner input,PrintStream out){
        System.out.println("What item would you like?");
        return input.nextLine();
    }

    public static double price(Scanner input,PrintStream out){
        System.out.println("How much is the price?");
        return input.nextDouble();

    }

    public static int quantity(Scanner input,PrintStream out){
        System.out.println("How many would you like?");
        int quantity = input.nextInt();
        input.nextLine();
        return quantity;
    }

    public static String amount(double number){
        return "$" + String.format("%,.2f",number);
    }

}
