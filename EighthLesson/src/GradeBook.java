import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GradeBook {

    public static void main(String[] args) {

        Set<String> namesOfStudents = TestResult.listOfStudentsNames();
        HashMap<String, Integer> firstTest = TestResult.getOriginalGrades();
        HashMap<String, Integer> secondTest = TestResult.getMakeUpGrades();

        HashMap<String, Integer> gradeBookMap = new HashMap<>();

        for (String studentName : namesOfStudents) {
            if (firstTest.get(studentName) > secondTest.get(studentName)) {
                gradeBookMap.put(studentName, firstTest.get(studentName));
            } else {
                gradeBookMap.put(studentName, secondTest.get(studentName));
            }
        }

        System.out.println("Students final grades: \n");
        for (HashMap.Entry studentRecord: gradeBookMap.entrySet()) {

            System.out.println("Student " + studentRecord.getKey() + "'s final mark is: " + studentRecord.getValue());

        }

    }

}
