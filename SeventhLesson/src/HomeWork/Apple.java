package HomeWork;

public class Apple extends Fruit {

    public Apple() {
        setCalories(52);
    }

    public void removeSeeds(){
        System.out.println("Seeds were removed from Apple");
    }

    public void makeJuice() {
        System.out.println("The Apple juice has been made.");
    }
}
