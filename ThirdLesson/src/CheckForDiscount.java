import java.util.Scanner;

public class CheckForDiscount {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter total sum of purchase: ");
        double sum = in.nextDouble();

        if (checkIfDiscountAvailable(sum)){
            System.out.println("The sum with discount is: " + calculatePriceWithDiscount(sum));
        } else{
            System.out.println("The sum is not enough to get discount. The sum of your purchase is: " + sum);
        }

    }

    private static boolean checkIfDiscountAvailable(double sum){
        return sum >= 1000;
    }

    private static double calculatePriceWithDiscount(double sum){
        return sum * 0.85;
    }
}
