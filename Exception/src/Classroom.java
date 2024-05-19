import java.util.Arrays;

public class Classroom {
    private String teacherName;
    private int numberOFStudents;
    private int[] grades;

    public Classroom(String teacherName,int numberOFStudents){
        this.teacherName = teacherName;
        this.numberOFStudents = numberOFStudents;
        grades = new int[numberOFStudents];
    }


    public String getTeacherName() {
        return teacherName;
    }
    public int[] getGrades() {
        return grades;
    }
    public int getNumberOFStudents() {
        return numberOFStudents;
    }

    public void setGrades(int[] grades) throws Exception{
        if (grades.length > this.numberOFStudents ){
            throw new Exception("The arr input high then numbers of students in the class. " + "\n" +
                    "The set grade failed!");
        }
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 0 || grades[i] > 100) {
                throw new IllegalArgumentException("The grade most to be between 0-100.");
            }
        }
        this.grades = grades;
    }
    public int getGradeForStudentWithIndex(int indexStudent)throws Exception{
        if (indexStudent < 0 || indexStudent > grades.length){
            throw new IndexOutOfBoundsException("The index is out of bounds.");
        }
        else if (grades[indexStudent] == 0){
            throw new IllegalStateException("No grade has yet been entered for this student. ");
        }else {
            return grades[indexStudent];
        }
    }

    public String toString(){
        String output = getClass().getSimpleName() +"--->" + "\n";
        output += "Teacher: " +this.teacherName +"\n";
        output += "Number of students: " + this.numberOFStudents +"\n";
        output += "The grades of class ---> " + "\n";
        output += Arrays.toString(grades);
        return output;
    }

}
