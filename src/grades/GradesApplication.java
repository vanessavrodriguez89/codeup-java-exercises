package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
//        create new Student objects
        var charles = new Student("Charles");
        var ryan = new Student("Ryan");
        var zihan = new Student("Zihan");
        var binjita = new Student("Binjita");

//        create student hashmap
        HashMap<String, Student> students = new HashMap<>();

        students.put("charlesbrantstec", charles);
        charles.addGrade(75);
        charles.addGrade(82);
        charles.addGrade(85);
        charles.addGrade(79);

        students.put("cuvillier-ryan", ryan);
        ryan.addGrade(93);
        ryan.addGrade(80);
        ryan.addGrade(72);
        ryan.addGrade(100);

        students.put("zihanhannah", zihan);
        zihan.addGrade(95);
        zihan.addGrade(79);
        zihan.addGrade(83);
        zihan.addGrade(85);

        students.put("bkandelbaral20", binjita);
        binjita.addGrade(79);
        binjita.addGrade(99);
        binjita.addGrade(84);
        binjita.addGrade(73);

        System.out.println(students);

        System.out.println("Welcome!\n\nHere are the GitHub usernames of our students:\n");
        System.out.print("| ");
        for (String username : students.keySet()){
            System.out.print(username + " | ");
        }
        Input scan = new Input();
        do {
        System.out.print("\n\nWhat student would you like to see more information on?\n> ");
        String studentSelection = scan.getString();
        System.out.println(studentSelection);
            if (students.containsKey(studentSelection)) {
                Student name = students.get(studentSelection);
                ArrayList grades = name.studentGrades;
                System.out.println("Name: " + name.getStudentName() + " - GitHub Username: " + studentSelection);
                System.out.println("Grades: " + grades.toString());
                System.out.println("Current Average: " + name.getGradeAverage());
                System.out.print("Would you like to see another student?(y/n)\n> ");
            } else System.out.print("Sorry, no student found with the GitHub username of \"" + studentSelection + "\".\n Would you like to see another student?(y/n)\n> ");

        } while (scan.yesNo());



    }
}
