import java.util.Scanner;

public class CompareNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter number One to compare: ");
        int numberOne = in.nextInt();

        System.out.println("Enter number Two to compare: ");
        int numberTwo = in.nextInt();

        if (compareNumbers(numberOne, numberTwo) == 1){
            System.out.println("Number One: " + numberOne + " is the greatest number than number Two: " + numberTwo);
        }
        else if ((compareNumbers(numberOne, numberTwo) == 2)) {
            System.out.println("Number Two: " + numberTwo + " is the greatest number than number One: " + numberOne);
        }
        else if ((compareNumbers(numberOne, numberTwo) == 3)) {
            System.out.println("Number Two: " + numberTwo + " equals to number One: " + numberOne);
        }
    }

    private static int compareNumbers(int numberOne, int numberTwo){
        if (numberOne > numberTwo){
            return 1;
        }
        else if (numberTwo > numberOne){
            return 2;
        } else {
            return 3;
        }

    }
}
