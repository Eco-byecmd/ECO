import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ACTIVITY3_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int length = 0, width = 0, area, perimeter;
        boolean valid;
        String choice;

        do {
            // Input length
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

            // Input width
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

            // If length == width → compute area, else → perimeter
            if (length == width) {
                area = length * width;   // ✅ multiplication
                System.out.println("Area = " + area);
            } else {
                perimeter = 2 * (length + width);
                System.out.println("Perimeter = " + perimeter);
            }

            // Ask user if they want to continue
            System.out.print("Do you want to continue? (Yes/No): ");
            choice = reader.readLine();

                } while (choice.equalsIgnoreCase("yes"));
            }
        }