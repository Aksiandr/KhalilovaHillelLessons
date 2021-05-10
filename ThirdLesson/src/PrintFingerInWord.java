import java.util.Scanner;

public class PrintFingerInWord {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of finger to know the name of finger: ");
        int fingerNumber = in.nextInt();
        System.out.println("The name of finger is: " + identifyFinger(fingerNumber));

    }

    private static String identifyFinger(int fingerNumber){
        switch (fingerNumber){
            case 1:
                return "Thumb";
            case 2:
                return "Forefinger";
            case 3:
                return "Middle";
            case 4:
                return "Ring";
            case 5:
                return "Little";
        }
        return "Unknown";
    }
}
