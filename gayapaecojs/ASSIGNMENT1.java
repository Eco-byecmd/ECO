import java.util.Scanner;
public class Gayapa {
    public static void main(String[] args) {
        // Create a Scanner to get input from the user
        Scanner input = new Scanner(System.in);
        // Ask the user to type their full name
        System.out.print("Full Name:");
        String name = input.nextLine();
        // Ask the user to type their age
        System.out.print("Age:");
        int age = input.nextInt();
        // Clear the input buffer so we can read the next line properly
        input.nextLine();
        // Ask the user to type their sex (Male or Female)
        System.out.print("Sex(Male/Female):");
        String sex = input.nextLine();
        // If the user typed "Male" (ignoring uppercase or lowercase letters)
        if (sex.equalsIgnoreCase("Male")) {
            // Say hello using "Mr." before their name and show their age
            System.out.println("Nice meeting you! Mr. " + name + ", " + age);
        } 
        // If the user typed "Female" (ignoring uppercase or lowercase letters)
        else if (sex.equalsIgnoreCase("Female")) {
            // Say hello using "Ms." before their name and show their age
            System.out.println("Nice meeting you! Ms. " + name + ", " + age);
        }
    }
}