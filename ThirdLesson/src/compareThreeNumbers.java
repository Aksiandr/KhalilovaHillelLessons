import java.util.Scanner;

public class compareThreeNumbers {

    private static double maxNumber;
    private static double minNumber;
    private static double middleNumber;
    private static boolean allNumbersEqual;
    private static boolean firsEqualsSecond;
    private static boolean firstEqualsThird;
    private static boolean secondEqualsThird;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: \n");
        double firstNumber = in.nextDouble();

        System.out.println("Enter the second number: \n");
        double secondNumber = in.nextDouble();

        System.out.println("Enter the third number: \n");
        double thirdNumber = in.nextDouble();

        compareNumbers(firstNumber, secondNumber, thirdNumber);

        if (allNumbersEqual) {
            System.out.println("All numbers equals each other. \nThe value is: " + maxNumber);
        }
        else if (firsEqualsSecond) {
            System.out.println("First and Second numbers equals each other. " +
                    "\nThe biggest number is: " + maxNumber +
                    "\nThe middle number is: " + middleNumber +
                    "\nThe smallest number is: " + minNumber);
        }
        else if (firstEqualsThird) {
            System.out.println("First and Third numbers equals each other. " +
                    "\nThe biggest number is: " + maxNumber +
                    "\nThe middle number is: " + middleNumber +
                    "\nThe smallest number is: " + minNumber);
        }
        else if (secondEqualsThird) {
            System.out.println("Second and Third numbers equals each other. " +
                    "\nThe biggest number is: " + maxNumber +
                    "\nThe middle number is: " + middleNumber +
                    "\nThe smallest number is: " + minNumber);
        } else {
            System.out.println("\nThe biggest number is: " + maxNumber +
                    "\nThe middle number is: " + middleNumber +
                    "\nThe smallest number is: " + minNumber);
        }
    }

    private static void compareNumbers(double first, double second, double third){
        if (first != second & second != third & first != third){
            if (first > second & second > third){
                maxNumber = first;
                middleNumber = second;
                minNumber = third;
            }
            else if (first > second & second < third){
                if (first > third){
                    maxNumber = first;
                    middleNumber = third;
                    minNumber = second;
                } else {
                    maxNumber = third;
                    middleNumber = first;
                    minNumber = second;
                }
            } else {
                if (first > third & second > third){
                    maxNumber = second;
                    middleNumber = first;
                    minNumber = third;
                }
                else if (first < third & second > third){
                    maxNumber = second;
                    middleNumber = third;
                    minNumber = first;
                }
                else if (first < third & second < third){
                    maxNumber = third;
                    middleNumber = second;
                    minNumber = first;
                }
            }
        }
        else if (first == second & second == third){
            maxNumber = third;
            middleNumber = first;
            minNumber = second;
            allNumbersEqual = true;
        }
        else if (first != second & second == third){
            if (first > second){
                maxNumber = first;
                middleNumber = second;
                minNumber = third;
                secondEqualsThird = true;
            } else {
                maxNumber = third;
                middleNumber = second;
                minNumber = first;
                secondEqualsThird = true;
            }
        }
        else if (first == second & second != third){
            if (first > third){
                maxNumber = first;
                middleNumber = second;
                minNumber = third;
                firsEqualsSecond = true;
            } else {
                maxNumber = third;
                middleNumber = second;
                minNumber = first;
                firsEqualsSecond = true;
            }
        }
        else if (first == third & second != third){
            if (first > second){
                maxNumber = first;
                middleNumber = third;
                minNumber = second;
                firstEqualsThird = true;
            }
            else {
                maxNumber = second;
                middleNumber = third;
                minNumber = first;
                firstEqualsThird = true;
            }
        }
    }
}
