
import java.util.Scanner;

public class IT22050762Lab9Q4 {

    // Method 1: Calculate final mark
    public static double calcFinalMark(double assignment, double exam) {
        return (assignment * 0.30) + (exam * 0.70);
    }

    // Method 2: Find student grade
    public static char findGrades(double finalMark) {

        if (finalMark >= 75) {
            return 'A';
        }
        else if (finalMark >= 60) {
            return 'B';
        }
        else if (finalMark >= 50) {
            return 'C';
        }
        else {
            return 'F';
        }
    }

    // Method 3: Print student details
    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-15s %-15.2f %c%n", name, finalMark, grade);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        // Input details of 5 students
        for (int i = 0; i < 5; i++) {

            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.next();

            System.out.print("Enter Assignment Mark (out of 100) for "
                               + names[i] + ": ");
            double assignment = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for "
                               + names[i] + ": ");
            double exam = input.nextDouble();

            finalMarks[i] = calcFinalMark(assignment, exam);
            grades[i] = findGrades(finalMarks[i]);

            System.out.println();
        }

        // Display results
        System.out.printf("%-15s %-15s %s%n",
                          "Name", "Final Mark", "Grade");

        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }

        input.close();
    }
}
