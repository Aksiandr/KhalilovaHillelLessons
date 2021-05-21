import java.util.Scanner;

public class ReverseArray extends BaseMethods {

    private static int[] valuesArray;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();

        valuesArray = fillTheArrayWithRandomValues(size);
        printArray(valuesArray);

        reversedArray();
        System.out.println("Reversed Array: ");
        printArray(valuesArray);
    }

    private static void reversedArray() {
        int[] temporaryArray = new int[valuesArray.length];
        for (int i = valuesArray.length - 1; i >= 0; i--) {
            temporaryArray[valuesArray.length - 1 - i] = valuesArray[i];
        }
        valuesArray = temporaryArray;
    }
}
