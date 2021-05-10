import java.util.Scanner;

public class CalculateElementsInArray extends ArrayManipulations{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();

        int[] valuesArray = fillTheArrayWithRandomValues(size);
        printArray(valuesArray);

        System.out.println("The number of elements in array that divided by two but not divided by three is: " +
                calculateNumberOfElementDividedByTwoNotDividedByThee(valuesArray));

    }

    private static boolean checkIfNumberDividesByTwo(int number){
        return number % 2 == 0;
    }

    private static boolean checkIfNumberDividesByThree(int number){
        return number % 3 == 0;
    }

    private static int calculateNumberOfElementDividedByTwoNotDividedByThee (int[] valuesArray) {
        int count = 0;
        for (int number : valuesArray){
            if (checkIfNumberDividesByTwo(number) && !checkIfNumberDividesByThree(number)){
                ++count;
            }
        }
        return count;

    }
}
