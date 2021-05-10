import java.util.Scanner;

public class CheckForBonus {

    public static void main(String[] args) {

        int plannedSales = 10;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of sales you have already made: ");
        int sales = in.nextInt();

        if (checkIfBonusAvailable(sales, plannedSales)){
            System.out.println("You already have a bonus");
        } else {
            System.out.println("You'll need to made " + calculateSalesNumberToGetBonus(sales, plannedSales) +
                    " sales to get a bonus");
        }

    }

    private static boolean checkIfBonusAvailable(int sales, int plannedSales){
        return sales > plannedSales;
    }

    private static int calculateSalesNumberToGetBonus (int sales, int plannedSales){
        return plannedSales - sales + 1;
    }
}
