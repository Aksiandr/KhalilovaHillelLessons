import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GetSumOfDoubles {

    public static void main(String[] args) throws IOException {


        int numbersCount = 0;
        double sum = 0;
        double input = 0;

        while(true) {
            if (numbersCount == 5){
                break;
            }
            System.out.println("Enter double number: ");
            try {
                Scanner in = new Scanner(System.in);
                input = in.nextDouble();
                numbersCount += 1;
            } catch (InputMismatchException e) {
                System.out.println("The number you have entered is not double. Please try again. ");
                input = 0;
            }
            finally {
                sum = sum + input;
            }

        }
        System.out.println("The sum is: " + sum);

    }
}
