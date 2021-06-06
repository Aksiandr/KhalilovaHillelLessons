package HomeWork;

public class AndroidSmartphone extends Phone {

    String os;
    String chargeInterface;
    String appStore;

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getChargeInterface() {
        return chargeInterface;
    }

    public void setChargeInterface(String chargeInterface) {
        this.chargeInterface = chargeInterface;
    }

    public String getAppStore() {
        return appStore;
    }

    public void setAppStore(String appStore) {
        this.appStore = appStore;
    }

    @Override
    public void os() {
        setOs("Android");
    }

    @Override
    public void chargeInterface() {
        setChargeInterface("Type-C");
    }

    @Override
    public void appStore() {
        setAppStore("Play Store");
    }

}
