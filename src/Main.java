import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Init variables
        HashMap<String, Integer> subjectGrades = new HashMap<String, Integer>();

        subjectGrades.put("Capstone", 100);
        subjectGrades.put("English", 96);
        subjectGrades.put("Math", 71);

        int highestGrade = -1; // unreachable number
        int lowestGrade = 101; // unreachable number
        String highestSubject = "";
        String lowestSubject = "";
        float average = 0;
        int classes = 0;

        // Loop through data to set variables
        for (String key : subjectGrades.keySet()) {
            int grade = subjectGrades.get(key);

            if (grade > highestGrade) {
                highestGrade = grade;
                highestSubject = key;
            } else if (grade < lowestGrade) {
                lowestGrade = grade;
                lowestSubject = key;
            }

            average += grade;
            classes++;
        }
        average /= classes;

        // Print data out
        System.out.println("Grades by Subject:");
        for (String key : subjectGrades.keySet()) {
            System.out.printf("%-15s %d\n", key, subjectGrades.get(key));
        }

        System.out.printf("\nNumber of Classes: %d\n\n", classes);

        System.out.println("Lowest Grade");
        System.out.printf("Subject: %s\n", highestSubject);
        System.out.printf("Grade: %d\n\n", highestGrade);

        System.out.println("Highest Grade");
        System.out.printf("Subject: %s\n", lowestSubject);
        System.out.printf("Grade: %d\n\n", lowestGrade);

        System.out.printf("Overall Average: %.02f\n", average);
    }
}