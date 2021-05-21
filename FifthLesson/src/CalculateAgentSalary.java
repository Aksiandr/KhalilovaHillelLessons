import java.util.Scanner;

public class CalculateAgentSalary {

    //    В методе main проинициализировать все нужные переменные, вызвать методы и
//    сделать расчет. Результат вывести в консоль
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter worker total hours per month: \n");
        int hoursNumber = in.nextInt();

        System.out.println("Enter the worker rate per hour: \n");
        double rate = in.nextDouble();

        System.out.println("Enter the years number of worker experience: \n");
        int experience = in.nextInt();

        System.out.println("Enter total number of worker sales per month: \n");
        int salesNumber = in.nextInt();

        System.out.println("Enter total sum of worker sales per month: \n");
        double salesTotalSum = in.nextDouble();

        double experienceRatio = setExperienceRatio(experience);
        double overtime = setOvertime(hoursNumber, rate);
        double bonusForSalesNumber = setBonusOrFineForSalesNumber(salesNumber);
        double bonusForSalesSum = setBonusForSalesSum(salesTotalSum);

        System.out.println("Experience Ratio is: " + experienceRatio + "\n" +
                "Overtime is: " + overtime + "\n" +
                "Bonus for sales number is: " + bonusForSalesNumber + "\n" +
                "Bonus for total sales sum is: " + bonusForSalesSum + "\n");

        double salary = hoursNumber > 160 ?
                (160 * rate * experienceRatio + overtime + bonusForSalesNumber + bonusForSalesSum)
                : (hoursNumber * rate * experienceRatio + overtime + bonusForSalesNumber + bonusForSalesSum);
        System.out.println("The worker salary is: " + salary);

    }

    //    1. Первый метод получает количество отработанных часов и базовую ставку
//    если количество отработанных часов больше 160 то каждый последующий час
//    по коэф 1,5 (параметры у метода - входящие часы int, возвращаемое значение
//    double коэффициент)
    private static double setOvertime(int hoursNumber, double rate) {
        if (hoursNumber > 160) {
            return (hoursNumber - 160) * 1.5 * rate;
        } else {
            return 0;
        }
    }

    //            2. Второй метод - получает коэффициент на базовые часы (которые до 160) в
//    зависимости от стажа работы (параметры у метода - стаж работы int,
//                                 возвращаемое значение double коэффициент)
//    до 2 лет 1
//    от 2 до 4 - 1.2
//    от 4 до 6 - 1.3
//    от 6 лет - 1.4
    private static double setExperienceRatio(int experience) {
        if (experience <= 2) {
            return 1;
        } else if (experience <= 4) {
            return 1.2;
        } else if (experience <= 6) {
            return 1.3;
        } else {
            return 1.4;
        }

    }

    //            3. В зависимости от количества продаж - больше 20 - бонус 250, меньше 10
//    штраф 150 (параметры у метода - количество продаж int, возвращаемое
//    значение double бонус за количество продаж)
    private static double setBonusOrFineForSalesNumber(int salesNumber) {
        if (salesNumber < 10) {
            return -150;
        } else if (salesNumber > 20) {
            return 250;
        } else {
            return 0;
        }
    }

    //            4. четвертый в зависимости от суммы продаж больше 15000 $ - тоже добавляется
//    бонус (параметры у метода - сумма продаж double, возвращаемое значение
//double бонус за сумму продаж)
    private static double setBonusForSalesSum(double salesTotalSum) {
        if (salesTotalSum > 15000) {
            return 500;
        } else {
            return 0;
        }
    }

}
