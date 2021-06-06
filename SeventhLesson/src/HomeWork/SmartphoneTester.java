package HomeWork;

public class SmartphoneTester {

    public static void main(String[] args) {

        AndroidSmartphone androidSmartphone = new AndroidSmartphone();
        androidSmartphone.os();
        androidSmartphone.chargeInterface();
        androidSmartphone.appStore();

        System.out.println("The info about Android device: ");
        System.out.println("The os is: " + androidSmartphone.getOs());
        System.out.println("The charge interface is: " + androidSmartphone.getChargeInterface());
        System.out.println("The app store is: " + androidSmartphone.getAppStore());

        AppleSmartphone appleSmartphone = new AppleSmartphone();
        appleSmartphone.os();
        appleSmartphone.chargeInterface();
        appleSmartphone.appStore();

        System.out.println("The info about Apple device: ");
        System.out.println("The os is: " + appleSmartphone.getOs());
        System.out.println("The charge interface is: " + appleSmartphone.getChargeInterface());
        System.out.println("The app store is: " + appleSmartphone.getAppStore());

    }
}
