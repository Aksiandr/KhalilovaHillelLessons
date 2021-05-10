import java.util.Scanner;

public class SortArray extends ArrayManipulations {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the desire size of the array: ");
        int size = in.nextInt();

        int[] valuesArray = fillTheArrayWithRandomValues(size);

        printArray(valuesArray);

        System.out.println("After Sorting ");
        printArray(sortArrayElements(valuesArray));

    }

    private static int[] sortArrayElements(int[] valuesArray) {
        boolean continueSorting = true;
        int temporaryValue;
        while (continueSorting) {
            continueSorting = false;
            for (int index = 0; index < valuesArray.length - 1; index++) {
                if (valuesArray[index] > valuesArray[index + 1]) {
                    temporaryValue = valuesArray[index];
                    valuesArray[index] = valuesArray[index + 1];
                    valuesArray[index + 1] = temporaryValue;
                    continueSorting = true;
                }
            }
        }
        return valuesArray;
    }

}



