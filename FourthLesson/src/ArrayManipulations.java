import java.util.Random;

class ArrayManipulations {

    static int[] fillTheArrayWithRandomValues(int arraySize){
        int[] valuesArray = new int[arraySize];
        Random random = new Random();
        for (int index = 0; index < arraySize; index++){
            valuesArray[index] = random.nextInt(100);
        }
        return valuesArray;
    }

    static void printArray(int[] valuesArray) {
        System.out.println("The array contains such elements: \n");
        for (int element : valuesArray) {
            System.out.println(element);
        }
    }
}
