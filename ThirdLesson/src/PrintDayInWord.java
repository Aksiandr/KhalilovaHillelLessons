import java.util.Scanner;

public class PrintDayInWord {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number of day: ");
        int day = in.nextInt();
        System.out.println("(If Else) -> The day you have chosen: " + printDayInWordIfElse(day));
        System.out.println("(Switch Case) -> The day you have chosen: " + printDayInWordSwitchCase(day));

    }

    private static String printDayInWordIfElse(int day) {
        if (day == 1) {
            return "Monday";
        } else if (day == 2) {
            return "Tuesday";
        } else if (day == 3) {
            return "Wednesday";
        } else if (day == 4) {
            return "Thursday";
        } else if (day == 5) {
            return "Friday";
        } else if (day == 6) {
            return "Saturday";
        } else if (day == 7) {
            return "Sunday";
        }  else {
            return "Not a valid day";
        }
    }

    private static String printDayInWordSwitchCase(int day) {
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Not a valid day";
        }
    }
}
