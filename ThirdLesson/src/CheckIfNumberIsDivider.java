import java.util.Scanner;

public class CheckIfNumberIsDivider {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the First number that will be divided: ");
        double b = in.nextDouble();

        System.out.println("Enter the Second number to check if is it the divider of the First number: ");
        double a = in.nextDouble();

        if (checkForZero(a)) {
            System.out.println("A number must NOT equal to 0. Please enter the number again: ");
            a = in.nextDouble();

            if (checkForZero(a)) {
                System.out.println("The program is not able to check divider to A = 0. " +
                        "Run the program again. \nDONE");
            } else {
                System.out.println(checkForDivider(b, a) ? "The Second number is divider of the First Number" :
                        "The Second number is NOT divider of the First Number");
            }
        } else {
            System.out.println(checkForDivider(b, a) ? "The Second number is divider of the First Number" :
                    "The Second number is NOT divider of the First Number");
        }

    }

    private static boolean checkForDivider(double b, double a) {
        return b % a == 0;
    }

    private static boolean checkForZero(double a) {
        return a == 0;
    }
}
