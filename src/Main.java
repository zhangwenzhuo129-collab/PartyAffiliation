import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // PSEUDO CODE:
        // Display menu: D, R, I
        // Read user's choice as a String
        // If choice is D then output Democratic Donkey
        // Else if choice is R then output Republican Elephant
        // Else if choice is I then output Independent Person
        // Else output Other

        Scanner in = new Scanner(System.in);

        System.out.println("Party Affiliation Menu:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.print("Enter your choice (D, R, I): ");

        String choice = in.nextLine();

        if (choice.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (choice.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (choice.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get an Other.");
        }
    }
}