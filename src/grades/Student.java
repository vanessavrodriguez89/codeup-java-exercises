package grades;

import java.util.ArrayList;

public class Student {
    private String studentName;
    ArrayList<Integer> studentGrades = new ArrayList<>();

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void addGrade(int grade) {
        studentGrades.add(grade);
    }

    public double getGradeAverage() {
        double total = 0;
       for (double grade : studentGrades){
           total += grade++;
       }
       return total / studentGrades.size();

    }

    public static void main(String[] args) {
        var vanessa = new Student("Vanessa");

        vanessa.addGrade(93);
        vanessa.addGrade(80);
        vanessa.addGrade(76);
        vanessa.addGrade(85);
        vanessa.addGrade(95);
        vanessa.addGrade(100);

        System.out.println(vanessa.studentGrades);
        System.out.println(vanessa.getGradeAverage());


    }
}
