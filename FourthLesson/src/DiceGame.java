import java.util.Random;
import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {

        System.out.println("You have 5 attempts to roll the dice and reach 20 points. \n");
        movingAroundThePlayingField();

    }

    private static void movingAroundThePlayingField (){
        int attempts = 0;
        int scores = 0;
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        do {
            ++attempts;
            System.out.println("Attempt #" + attempts);
            System.out.println("Enter 'true' to roll the dice.");
            boolean step = in.nextBoolean();

            int die = random.nextInt(6) + 1;
            scores = scores + die;
            if (scores == 20){
                System.out.println("Congrats! You won the game!");
                break;
            } else if (scores > 20){
                System.out.println("You've got scores: " + scores);
                System.out.println("Sorry! You lost the game! \nTry again");
                break;
            } else if (attempts == 5 && scores < 20){
                System.out.println("You've got scores: " + scores);
                System.out.println("Sorry! You lost the game! \nTry again");
                break;
            }

            System.out.println("Now You are on " + scores + " field. " +
                        "You'll need to reach " + (20 - scores) + " scores to win");

        } while (attempts < 5);

    }
}
