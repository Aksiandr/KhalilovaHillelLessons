import java.util.Scanner;

public class GetPhoneBill {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter how many Gigabytes were used by month: \n");
        double usedGigabytes = in.nextDouble();

        System.out.println("Enter how many calls minutes were made in Ukraine: \n");
        int callsMinutesInUkraine = in.nextInt();

        System.out.println("Enter how many sms were sent: \n");
        int smsNumber = in.nextInt();

        System.out.println("Enter how many calls minutes were made Abroad Zone #1: \n");
        int callsMinutesAbroadZoneOne = in.nextInt();

        System.out.println("Enter how many calls minutes were made Abroad Zone #2: \n");
        int callsMinutesAbroadZoneTwo = in.nextInt();

        double internetBill = calculateSumForInternet(usedGigabytes);
        double callsUkraineBill = calculateSumForCallsInUkraine(callsMinutesInUkraine);
        double smsBill = calculateSumForSMS(smsNumber);
        double zoneOneBill = calculateSumForCallsAbroadZoneOne(callsMinutesAbroadZoneOne);
        double zoneTwoBill = calculateSumForCallsAbroadZoneTwo(callsMinutesAbroadZoneTwo);
        double totalBill = internetBill + callsUkraineBill + smsBill + zoneOneBill + zoneTwoBill;

        System.out.println("Bill for the Internet: " + internetBill);
        System.out.println("Bill for the calls in Ukraine: " + callsUkraineBill);
        System.out.println("Bill for the SMS: " + smsBill);
        System.out.println("Bill for the calls Abroad Zone #1: " + zoneOneBill);
        System.out.println("Bill for the calls Abroad Zone #2: " + zoneTwoBill);

        System.out.println("Total bill is: " + totalBill);

        System.out.println("Final bill with tax 7% is: " + totalBill * 1.07);


    }

//    Рассчитать стоимость пакета в месяц. Расчёт по каждому из параметров
//    сделать в отдельном методе. Потом общий подсчёт провести в методе main и вывести
//    в консоль c помощью sout
//1. Стоимость интернета до 8гб включена в пакет, после 50 грн / 500 мб (вход
//                                                                               параметр кол-во потраченных гб)
//2. Звонки по Украине до 500 минут 0,5 грн / мин после 0,75
//            3. Смс до 50 шт 1 грн после 1,50
//            4. Звонки за рубеж зона 1 1.5 грн/мин
//5. Звонки за рубеж зона 2 2 грн/мин
//    После подсчёта суммы добавляется налог 7 %

    private static double calculateSumForInternet(double usedGigabytes) {
        double gigabytesToMegabytes = usedGigabytes * 1024;
        double freeMegabytes = 8 * 1024;
        double sum = 0;
        if (gigabytesToMegabytes > freeMegabytes) {
            for (double i = gigabytesToMegabytes - freeMegabytes; i > 0; i = i - 500) {
                sum = sum + 50;
            }
        }
        return sum;
    }

    private static double calculateSumForCallsInUkraine(double minutes) {
        if (minutes <= 500) {
            return minutes * 0.5;
        } else {
            return 500 * 0.5 + (minutes - 500) * 0.75;
        }
    }

    private static double calculateSumForCallsAbroadZoneOne(double minutes) {
        return minutes * 1.5;
    }

    private static double calculateSumForCallsAbroadZoneTwo(double minutes) {
        return minutes * 2;
    }

    private static double calculateSumForSMS(double sms) {
        if (sms <= 50) {
            return sms;
        } else {
            return 50 + (sms - 50) * 1.5;
        }
    }
}
