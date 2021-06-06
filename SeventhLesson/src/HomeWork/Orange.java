package HomeWork;

public class Orange extends Fruit {

    public Orange() {
        setCalories(47);
    }

    public void cutPieces(){
        System.out.println("The Orange was cut");
    }

    public void removeSeeds() {
        System.out.println("Seeds were removed from the Orange");
    }

    public void makeJuice() {
        System.out.println("The Orange juice has been made.");
    }
}
