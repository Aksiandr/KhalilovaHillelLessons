import java.util.InputMismatchException;
import java.util.Scanner;

public class GetSumOfDoubles {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numbersCount = 0;
        double sum = 0;
        double input = 0;

        while(true) {
            if (numbersCount == 5){
                break;
            }
            System.out.println("Enter double number: ");
            try {
                input = in.nextDouble();
                numbersCount += 1;
            } catch (Exception e) {
                System.out.println("The number you have entered is not double. Please try again. ");
                input = 0;
            } finally {
                sum = sum + input;
            }

        }
        System.out.println("The sum is: " + sum);

    }
}
