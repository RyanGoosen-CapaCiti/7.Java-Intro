import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Act3_Grading_System {
    private List<Integer> grades;

    public Act3_Grading_System() {
        grades = new ArrayList<>();
    }

    public String getGrade(int score) {
        String grade = "";
        if (score < 25) {
            grade = "F";
        } else if (score >= 25 && score < 45) {
            grade = "E";
        } else if (score >= 45 && score < 50) {
            grade = "D";
        } else if (score >= 50 && score < 60) {
            grade = "C";
        } else if (score >= 60 && score <= 80) {
            grade = "B";
        } else {
            grade = "A";
        }
        return grade + " (" + score + ")";
    }

    public void calculateGrades() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the grades (type 'end' to stop):");
        String input;
        while (true) {
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")) {
                break;
            } else {
                try {
                    int grade = Integer.parseInt(input);
                    grades.add(grade);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number or 'end' to stop.");
                }
            }
        }

        System.out.println("Grades entered: ");
        for (int grade : grades) {
            System.out.println(getGrade(grade));
        }
    }

    public static void main(String[] args) {
        Act3_Grading_System gradingSystem = new Act3_Grading_System();
        gradingSystem.calculateGrades();
    }
}
