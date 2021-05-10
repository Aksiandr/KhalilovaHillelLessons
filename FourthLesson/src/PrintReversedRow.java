import java.util.Scanner;

public class PrintReversedRow {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the row to print it reversed: ");
        String row = in.nextLine();
        System.out.println("Reversed row is: ");
        printPeversedRow(row);

    }

    private static void printPeversedRow(String row) {
        char[] rowToChar = row.toCharArray();
        char[] reversedRowArray = new char[rowToChar.length];
        for (int i = rowToChar.length - 1; i >= 0; i--) {
            reversedRowArray[rowToChar.length - 1 - i] = rowToChar[i];
        }
        System.out.println(reversedRowArray);
    }
}
