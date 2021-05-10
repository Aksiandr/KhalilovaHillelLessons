import java.util.Scanner;

public class CheckOddEven {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number to check either it is odd or even:");
        int number = in.nextInt();

        if (checkOddEven(number)){
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        System.out.println("BYE");
    }

    private static boolean checkOddEven(int number){
        return number % 2 == 0;
    }
}
