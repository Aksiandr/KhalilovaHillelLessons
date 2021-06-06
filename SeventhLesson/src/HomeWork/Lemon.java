package HomeWork;

public class Lemon extends Fruit {

    public Lemon() {
        setCalories(29);
    }

    public void removeLemonZest(){
        System.out.println("Lemon Zest was grated");
    }

    public void removeSeeds() {
        System.out.println("Seeds were removed from the Lemon");
    }

    public void makeJuice() {
        System.out.println("The Lemon juice has been made.");
    }
}
