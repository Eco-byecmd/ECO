import java.util.Scanner;

public class Age {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the man's age: ");
        int manAge = scanner.nextInt();

        double wifeAge = (manAge / 2.0) + 7;

                System.out.printf("The ideal age of the wife is: %.1f\n", wifeAge);
        
                scanner.close();
            }
        }