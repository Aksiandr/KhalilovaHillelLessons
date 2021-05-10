import java.util.Scanner;

public class ReverseArray extends ArrayManipulations {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();

        int[] valuesArray = fillTheArrayWithRandomValues(size);
        printArray(valuesArray);

        System.out.println("Reversed Array");
        printArray(reversedArray(valuesArray));
    }

    private static int[] reversedArray(int[] valuesArray) {
        int[] reversedArray = new int[valuesArray.length];
        for (int i = valuesArray.length - 1; i >= 0; i--) {
            reversedArray[valuesArray.length - 1 - i] = valuesArray[i];
        }
        return reversedArray;
    }
}
