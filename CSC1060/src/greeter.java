/*
Sam Monson
CSC1060
February 9, 2025
ask donor info and donation amount
 */
import java.sql.SQLOutput;
import java.util.Scanner;
public class greeter {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your Name? ");
        String name = userInput.nextLine();

        System.out.println("Where are you from? ");
        String from = userInput.nextLine();

        System.out.println("How Old are You? ");
        int age = userInput.nextInt();
        userInput.nextLine(); // as far as i can tell this "resets"(?) the scanner

        System.out.print("Hello " + name + " from " + from + "! ");
        System.out.println("You are " + age + " years old.");

        System.out.println("Whats something you like to do for fun? ");
        String hobby = userInput.nextLine();

        System.out.println("Have fun next time you " + hobby);

        System.out.println("How much would you like to donate today? ");
        int money = userInput.nextInt();

        System.out.println("You will donate " + money + " today. Yay!");
    }
}
