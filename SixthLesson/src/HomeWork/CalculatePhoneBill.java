package HomeWork;

public class CalculatePhoneBill {

    public static void main(String[] args) {

        PhoneBill phoneBill = new PhoneBill(8.7, 220, 10,
                10, 60);

        System.out.println("Bill for the Internet: " + phoneBill.getBillForInternet());
        System.out.println("Bill for the calls in Ukraine: " + phoneBill.getBillForUkraineCalls());
        System.out.println("Bill for the SMS: " + phoneBill.getBillForSMS());
        System.out.println("Bill for the calls Abroad Zone #1: " + phoneBill.getBillForZoneOneCalls());
        System.out.println("Bill for the calls Abroad Zone #2: " + phoneBill.getBillForZoneTwoCalls());
        System.out.println("Total bill is: " + phoneBill.getPhoneBill());
        System.out.println("Final bill with tax 7% is: " + phoneBill.getPhoneBillWithTax());


    }

}
