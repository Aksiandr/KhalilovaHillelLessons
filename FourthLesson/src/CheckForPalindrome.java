import java.util.Scanner;

public class CheckForPalindrome {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the row to check if it is the palindrome: ");
        String row = in.nextLine();
        if (checkIfStringIsPalindrome(row)) {
            System.out.println("The row: '" + row + "' is a palindrome");
        } else {
            System.out.println("The row: '" + row + "' is NOT a palindrome");
        }


    }

    private static boolean checkIfStringIsPalindrome(String row) {
        char[] rowToChar = row.toCharArray();

        if (rowToChar.length % 2 != 0){
            return false;
        }
        for (int i = 0; i < rowToChar.length; i++) {
            if (rowToChar[i] != rowToChar[rowToChar.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
