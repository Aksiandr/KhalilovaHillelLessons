import java.util.Scanner;

public class CalculateSalary {

    public static void main(String[] args) {

        int plannedSales = 10;
        int bonus = 250;
        int rate = 1000;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter how many sales the sale manager have been made this month: \n");
        int sales = in.nextInt();

        System.out.println("Salary of the sales manager is: " + calculateSalary(sales, plannedSales, rate, bonus));

    }

    private static int calculateSalary(int sales, int plannedSales, int rate, int bonus){
        return sales > plannedSales ? (rate + bonus) : rate;
    }
}
