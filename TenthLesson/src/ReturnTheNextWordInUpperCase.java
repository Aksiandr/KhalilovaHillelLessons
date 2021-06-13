import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ReturnTheNextWordInUpperCase {

    public static void main(String[] args) {
        afterFeelInUpperCase("Get a modern feel with a smudge-resistant only for\n" +
                "//    $2.50, you can finish now", "feel");
        ////////////////////////////////////////////////////////////
        System.out.println(withoutFirstAndLastChar("g"));
        System.out.println(withoutFirstAndLastChar("go"));
        System.out.println(withoutFirstAndLastChar("gone"));
        /////////////////////////////////////////////////////////////
        System.out.println(repeatRepeatRepeat("gol"));
        System.out.println(repeatRepeatRepeat("goll"));
        ////////////////////////////////////////////////////////////
        System.out.println(backAround("workZ"));

        
    }

    public static String afterFeelInUpperCase(String inputString, String whenStartToGet) {
        //    Написать метод который принимает в себя строку с несколькими словами и
//    возвращает строку с одним словом, которое идет за текущим в upper case
//            (например мы ищем строке “Get a modern feel with a smudge-resistant only for
//    $2.50, you can finish now” слово которой идет после слова “feel” (т.е. должен
//    вернуть “WITH” )
        Pattern regularExpressionPattern = Pattern.compile(whenStartToGet + "\\s+(\\w+)\\s");
        String result;
        if (inputString.contains(whenStartToGet)) {
            Matcher inputStringMatched = regularExpressionPattern.matcher(inputString);
            result = inputStringMatched.group();
            System.out.println(result);
        } else {
            result = "The entity '" + whenStartToGet + "' is not found in a string";
        }

        return result;
    }

    public static String withoutFirstAndLastChar(String inputString) {
//        2. Для входящей строки вернуть версию без первого и последнего символов
//        строки. Строка может быть любой длины, включая 0.
//        public String withoutFirstAndLastChar(String inputString) {}
//        "Hello" → "ell"
//        "abc" → "b"
        return (inputString.length() > 1)? (inputString.substring(1, inputString.length() - 1)) :
                "The length of string is not enough to return substring without first and last character";
    }

//    3. Если длина строки меньше или равно 3, то она остается без изменений. Если
//    больше 3, то нужно вернуть новую строку, которая составляет 3 копии первых
//    трех символов
//    public String repeatRepeatRepeat(String inputString ) { }
//"Java" → "JavJavJav"
//        "Chocolate" → "ChoChoCho"
//        "abc" → "abс"

    public static String repeatRepeatRepeat(String inputString ) {
        return (inputString.length() <= 3)? inputString :
                String.join(inputString.substring(0, 3), inputString.substring(0, 3), inputString.substring(0, 3));
    }

//    4. Взять последний символ в строке и вернуть новую строку с последним
//    символом, добавленным спереди и сзади, «cat» -> «tcatt».
//    public String backAround(String str) {}
//"cat" → "tcatt"
//        "Hello" → "oHelloo"
//        "a" → "aaa"


    public static String backAround(String str) {
        return str.substring(str.length() - 1) + str + str.substring(str.length() - 1);
    }

}
