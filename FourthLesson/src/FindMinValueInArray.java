import java.util.Scanner;

public class FindMinValueInArray extends ArrayManipulations{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of elements in array (array size): ");
        int arraySize = in.nextInt();
        int[] values_array = fillTheArrayWithRandomValues(arraySize);
        printArray(values_array);
        System.out.println("The min value of array is: " + findMinValueInArray(values_array));
    }

    private static int findMinValueInArray(int[] valuesArray){
        int minValue = valuesArray[0];
        for (int index = 1; index < valuesArray.length; index++ ) {
//            minValue = minValue <= valuesArray[index] ? minValue : valuesArray[index];
            minValue = Math.min(minValue, valuesArray[index]);
        }
        return minValue;
    }

}
