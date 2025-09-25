import java.util.Scanner;
public class Gayapa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Full Name:");
        String name = input.nextLine();
        System.out.print("Age:");
        int age = input.nextInt();
        input.nextLine();
        System.out.print("Sex(Male/Female):");
        String sex = input.nextLine();
        if (sex.equalsIgnoreCase("Male")) {
            System.out.println("Nice meeting you! Mr. " + name + ", " + age);
        } else if (sex.equalsIgnoreCase("Female")) {
            System.out.println("Nice meeting you! Ms. " + name + ", " + age);
        }
    }
}