import java.util.Scanner;

public class CheckIfNumberBelongsToInterval {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number to check if it belongs to the interval (-5; 3)");
        double number = in.nextDouble();
        System.out.println(checkIfNumberBelongsToTheInterval(number) ?
                "The number belongs to the interval (-5; 3)" : "The number DOESN'T belong to the interval (-5;3)");

    }

    private static boolean checkIfNumberBelongsToTheInterval(double number){
        return number >= -5 & number <= 3;
    }
}
