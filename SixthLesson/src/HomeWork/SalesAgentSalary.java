package HomeWork;

public class SalesAgentSalary {

    private int hoursNumber;
    private double rate;
    private int experience;
    private int salesNumber;
    private double salesTotalSum;
    private double salary;


    public SalesAgentSalary(int hoursNumber, double rate) {
        this.hoursNumber = hoursNumber;
        this.rate = rate;
        setSalary(hoursNumber * rate);
    }

    public SalesAgentSalary(int hoursNumber, double rate, int experience, int salesNumber, double salesTotalSum) {
        this.hoursNumber = hoursNumber;
        this.rate = rate;
        this.experience = experience;
        this.salesNumber = salesNumber;
        this.salesTotalSum = salesTotalSum;
        setSalary(hoursNumber > 160 ?
                (160 * rate * setExperienceRatio() + setOvertime() + setBonusOrFineForSalesNumber() + setBonusForSalesSum())
                : (hoursNumber * rate * setExperienceRatio() + setBonusOrFineForSalesNumber() + setBonusForSalesSum()));
    }


    private double setOvertime() {
        if (this.hoursNumber > 160) {
            return (this.hoursNumber - 160) * 1.5 * rate;
        } else {
            return 0;
        }
    }


    private double setExperienceRatio() {
        if (this.experience <= 2) {
            return 1;
        } else if (this.experience <= 4) {
            return 1.2;
        } else if (this.experience <= 6) {
            return 1.3;
        } else {
            return 1.4;
        }

    }


    private double setBonusOrFineForSalesNumber() {
        if (this.salesNumber < 10) {
            return -150;
        } else if (this.salesNumber > 20) {
            return 250;
        } else {
            return 0;
        }
    }


    private double setBonusForSalesSum() {
        if (this.salesTotalSum > 15000) {
            return 500;
        } else {
            return 0;
        }
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }
}
