public class CalculateSinus {

    public static void main(String[] args) {

       calculateAndPrintSinus(360);
    }

    private static void calculateAndPrintSinus(int degree){
        for (int i = 0; i <= degree; i = i + 10){
            System.out.println("The sinus of the " + i + " degree is: " + Math.sin(Math.toRadians(i)));
        }
    }
}
