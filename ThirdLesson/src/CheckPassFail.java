import java.util.Scanner;

public class CheckPassFail {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the test mark you have got: ");
        int mark = in.nextInt();

        System.out.println("The result of your test is: " + checkPassFail(mark));
        in.close();
        System.out.println("DONE");

    }

    private static String checkPassFail(int mark){
        if (mark >= 50){
            return "PASS";
        } else {
            return "FAIL";
        }
    }

}
