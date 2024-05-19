import java.util.InputMismatchException;
import java.util.Scanner;
public class GradesClassProgram {
    public static void main(String[] args) {

        Classroom classroom = new Classroom("Yakov", 5);
        int[] grades = inputGradesForSet(classroom.getNumberOFStudents());

        try {
            classroom.setGrades(grades);
            System.out.println(classroom);
        } catch (Exception e) {
            System.out.println("ERORR: " + e.getMessage());
        }

        boolean isValidIndex = false;
        while (!isValidIndex) {
            try {
                System.out.println("Enter a number of student do u want to see the grades: ");
                int index = s.nextInt() - 1;
                int gradeForThisStudent = classroom.getGradeForStudentWithIndex(index);
                System.out.println("The grade for student " + (index + 1) + " is ---> " + gradeForThisStudent);
                isValidIndex = true;
            } catch (Exception e) {
                System.out.println(e.getMessage() + ", try again.");
            }
        }
    }

    public static int[] inputGradesForSet(int length){
        int[] grades = new int[length];
        System.out.println("Enter a " + grades.length +" grades ---> ");
        for (int i = 0; i < grades.length; i++) {
            while (true) {
                try {
                    System.out.print((i+1) +": ");
                    int grade = s.nextInt();
                    if (grade < 0 || grade > 100) {
                        throw new IllegalArgumentException("The grade most to be between 0-100.");
                    }
                    grades[i] = grade;
                    break;
                }catch (InputMismatchException e){
                    System.out.println("You entered a string instead of a number, try again..");
                    s.next();
                }
                catch (Exception e) {
                    System.out.println("Genrel ERORR: " + e.getMessage());
                    s.nextLine(); // לצרוב קלט לא תקין
                }
            }
        }
        return grades;
    }
    public static Scanner s = new Scanner(System.in);
}
