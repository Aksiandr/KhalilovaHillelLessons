import java.util.Scanner;

public class CheckIfMortgageAvailable {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter age of husband: ");
        int husbandAge = in.nextInt();

        System.out.println("Enter age of wife: ");
        int wifeAge = in.nextInt();

        if (checkAgeToGetMortgage(husbandAge, wifeAge)){
            System.out.println("The Mortgage allowed");
        } else {
            System.out.println("The Mortgage not allowed");
        }

    }

    private static boolean checkAgeToGetMortgage(int husbandAge, int wifeAge){
        if (wifeAge >= 25 & wifeAge <= 55){
            if (husbandAge >= 25 & husbandAge <= 55){
                return true;
            };
        }
        return false;

    }

}
