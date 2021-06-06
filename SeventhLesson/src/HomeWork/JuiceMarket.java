package HomeWork;

import java.util.Scanner;

public class JuiceMarket {

    public static void main(String[] args) {

        Apple appleJuice = new Apple();
        Banana bananaJuice = new Banana();
        Lemon lemonJuice = new Lemon();
        Orange orangeJuice = new Orange();

        System.out.println("Banana juice: ");
        bananaJuice.peel();
        bananaJuice.makeJuice();
        System.out.println("Banana juice kcal: " + bananaJuice.getCalories());

        System.out.println("Apple juice: ");
        appleJuice.removeSeeds();
        appleJuice.makeJuice();
        System.out.println("Apple juice kcal: " + appleJuice.getCalories());

        System.out.println("Orange juice: ");
        orangeJuice.cutPieces();
        orangeJuice.removeSeeds();
        orangeJuice.makeJuice();
        System.out.println("Orange juice kcal: " + orangeJuice.getCalories());

        System.out.println("Lemon juice: ");
        lemonJuice.removeLemonZest();
        lemonJuice.removeSeeds();
        lemonJuice.makeJuice();
        System.out.println("Lemon juice kcal: " + lemonJuice.getCalories());
    }
}
