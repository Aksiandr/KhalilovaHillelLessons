import java.util.Scanner;

public class SolveEquation {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("To solve equation - a*x + b = 0 " +
                "\nYou need to enter A and B numbers one by one. " +
                "\nBe attentive A number shouldn't equal to 0.");

        System.out.println("Enter number B: ");
        double b = in.nextDouble();

        System.out.println("Enter number A: ");
        double a = in.nextDouble();
        if (checkForZero(a)){
            System.out.println("A number must NOT equal to 0. Please enter the number again: ");
            a = in.nextDouble();

            if (checkForZero(a)){
                System.out.println("The program is not able to calculate the equation due to A = 0. " +
                        "Run the program again. \nDONE");
            } else{
                System.out.println("The result: x equals " + solveEquation(a, b));
            }
        }
        else {
            System.out.println("The result: x equals " + solveEquation(a, b));
        }

    }

    private static double solveEquation (double a, double b){
        return -b / a;
    }

    private static boolean checkForZero(double a){
        return a == 0;
    }
}
