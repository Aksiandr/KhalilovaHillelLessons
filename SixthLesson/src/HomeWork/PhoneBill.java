package HomeWork;

public class PhoneBill {

    private double usedGigabytes;
    private int minutesInUkraine;
    private int minutesAbroadZoneOne;
    private int minutesAbroadZoneTwo;
    private int sms;

    private double billForInternet;
    private double billForSMS;
    private double billForZoneOneCalls;
    private double billForZoneTwoCalls;
    private double billForUkraineCalls;
    private double phoneBill;
    private double phoneBillWithTax;


    public PhoneBill(double usedGigabytes, int callsMinutesInUkraine, int callsMinutesAbroadZoneOne, int callsMinutesAbroadZoneTwo, int sms) {
        this.usedGigabytes = usedGigabytes;
        this.minutesInUkraine = callsMinutesInUkraine;
        this.minutesAbroadZoneOne = callsMinutesAbroadZoneOne;
        this.minutesAbroadZoneTwo = callsMinutesAbroadZoneTwo;
        this.sms = sms;
        setBillForInternet(calculateSumForInternet());
        setBillForSMS(calculateSumForSMS());
        setBillForUkraineCalls(calculateSumForCallsInUkraine());
        setBillForZoneOneCalls(calculateSumForCallsAbroadZoneOne());
        setBillForZoneTwoCalls(calculateSumForCallsAbroadZoneTwo());
        setPhoneBill(calculateTotalPhoneBill());
        setPhoneBillWithTax(calculateTotalPhoneBillWithTax());
    }

    private double calculateSumForInternet() {
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

    private double calculateSumForCallsInUkraine() {
        if (minutesInUkraine <= 500) {
            return minutesInUkraine * 0.5;
        } else {
            return 500 * 0.5 + (minutesInUkraine - 500) * 0.75;
        }
    }

    private double calculateSumForCallsAbroadZoneOne() {
        return minutesAbroadZoneOne * 1.5;
    }

    private double calculateSumForCallsAbroadZoneTwo() {
        return minutesAbroadZoneTwo * 2;
    }

    private double calculateSumForSMS() {
        if (sms <= 50) {
            return sms;
        } else {
            return 50 + (sms - 50) * 1.5;
        }
    }

    private double calculateTotalPhoneBillWithTax() {
        return Math.round(calculateSumForInternet() + calculateSumForCallsInUkraine() + calculateSumForSMS()
                + calculateSumForCallsAbroadZoneOne() + calculateSumForCallsAbroadZoneTwo() * 1.07);
    }

    private double calculateTotalPhoneBill() {
        return calculateSumForInternet() + calculateSumForCallsInUkraine() + calculateSumForSMS()
                + calculateSumForCallsAbroadZoneOne() + calculateSumForCallsAbroadZoneTwo();
    }

    public void setBillForInternet(double billForInternet) {
        this.billForInternet = billForInternet;
    }

    public void setBillForSMS(double billForSMS) {
        this.billForSMS = billForSMS;
    }

    public void setBillForZoneOneCalls(double billForZoneOneCalls) {
        this.billForZoneOneCalls = billForZoneOneCalls;
    }

    public void setBillForZoneTwoCalls(double billForZoneTwoCalls) {
        this.billForZoneTwoCalls = billForZoneTwoCalls;
    }

    public void setBillForUkraineCalls(double billForUkraineCalls) {
        this.billForUkraineCalls = billForUkraineCalls;
    }

    public void setPhoneBill(double phoneBill) {
        this.phoneBill = phoneBill;
    }

    public void setPhoneBillWithTax(double phoneBillWithTax) {
        this.phoneBillWithTax = phoneBillWithTax;
    }

    public double getBillForInternet() {
        return billForInternet;
    }

    public double getBillForSMS() {
        return billForSMS;
    }

    public double getBillForZoneOneCalls() {
        return billForZoneOneCalls;
    }

    public double getBillForZoneTwoCalls() {
        return billForZoneTwoCalls;
    }

    public double getBillForUkraineCalls() {
        return billForUkraineCalls;
    }

    public double getPhoneBill() {
        return phoneBill;
    }

    public double getPhoneBillWithTax() {
        return phoneBillWithTax;
    }
}
