import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ACTIVITY3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean valid;
        String choice;
        do {
            int length = 0, width = 0;
            // Prompt for length
            do {
                valid = true;
                try {
                    System.out.print("Enter length: ");
                    length = Integer.parseInt(reader.readLine());
                } catch (IOException | NumberFormatException e) {
                    System.out.println("Invalid input. Please enter integer values.");
                    valid = false;
                }
            } while (!valid);
            // Prompt for width
            do {
                valid = true;
                try {
                    System.out.print("Enter width: ");
                    width = Integer.parseInt(reader.readLine());
                } catch (IOException | NumberFormatException e) {
                    System.out.println("Invalid input. Please enter integer values.");
                    valid = false;
                }
            } while (!valid);
            int area = length * width;
            int perimeter = 2 * (length + width);
            System.out.println("Area = " + area);
            System.out.println("Perimeter = " + perimeter);
            System.out.print("Do you want to continue? (yes/no): ");
            choice = reader.readLine();
        } while (choice.equalsIgnoreCase("yes"));
    }
}