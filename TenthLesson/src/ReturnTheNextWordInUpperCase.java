import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ReturnTheNextWordInUpperCase {

    public static void main(String[] args) {


        String pintNextWordInUpperViaRegex = afterFeelInUpperCaseViaRegularExpression("Get a modern feel " +
                "with a smudge-resistant only for $2.50, you can finish now", "only");
        System.out.println("First task via regular expression result: " + pintNextWordInUpperViaRegex);

        String pintNextWordInUpperViaSplit = afterFeelInUpperCaseViaSplit("Get a modern feel " +
                "with a smudge-resistant only for $2.50, you can finish now", "feel");
        System.out.println("First task via Split result: " + pintNextWordInUpperViaSplit);

        System.out.println("Second task results:");
        System.out.println(withoutFirstAndLastChar("g"));
        System.out.println(withoutFirstAndLastChar("go"));
        System.out.println(withoutFirstAndLastChar("gone"));

        System.out.println("Third task results:");
        System.out.println(repeatRepeatRepeat("gol"));
        System.out.println(repeatRepeatRepeat("goll"));

        System.out.println("Fourth task results:");
        System.out.println(backAround("workZ"));


    }

    public static String afterFeelInUpperCaseViaRegularExpression(String inputString, String whenStartToGet) {

        Pattern regularExpressionPattern = Pattern.compile(whenStartToGet + "\\s+(\\w+)\\s");
        String result = "No word was found in the input String for word: " + whenStartToGet;
        Matcher inputStringMatched = regularExpressionPattern.matcher(inputString);
        if (inputStringMatched.find()) {
            try {
                result = inputStringMatched.group(1).toUpperCase(Locale.ROOT);
            } catch (Exception e) {
                result = "No group was found in the input string";
            }
        }
        return result;
    }

    public static String afterFeelInUpperCaseViaSplit(String inputString, String whenStartToGet) {

        String[] inputStringSplit = inputString.split(" ");
        boolean takeTheNextWord = false;

        for (String word: inputStringSplit) {
            if (takeTheNextWord) {
                return word.toUpperCase(Locale.ROOT);
            }
            if (word.equals(whenStartToGet)) {
                takeTheNextWord = true;
            }
        }

        return "No searching word was found";
    }

    public static String withoutFirstAndLastChar(String inputString) {

        return (inputString.length() > 1) ? (inputString.substring(1, inputString.length() - 1)) :
                "The length of string is not enough to return substring without first and last character";
    }

    public static String repeatRepeatRepeat(String inputString) {
        return (inputString.length() <= 3) ? inputString :
                String.join(inputString.substring(0, 3), inputString.substring(0, 3), inputString.substring(0, 3));
    }

    public static String backAround(String str) {
        return str.substring(str.length() - 1) + str + str.substring(str.length() - 1);
    }

}
