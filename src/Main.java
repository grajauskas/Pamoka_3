import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student studentas = new Student();
        studentas.age = 17;
        studentas.name = "Petras";
        studentas.surname = "Petraitis";
        studentas.grades.add(9);
        studentas.grades.add(10);

        Student studentas2 = new Student();
        studentas2.age = 19;
        studentas2.name = "Kukulis";
        studentas2.surname = "Kukuliauskas";
        studentas2.grades.add(5);
        studentas2.grades.add(8);


        Student studentas3 = new Student("Algis", "Ramanauskas", 54);
        Student studentas4 = new Student("mindaugas", "Krasauskas", 25);

        ArrayList<Student> students = new ArrayList<>();
        students.add(studentas);
        students.add(studentas3);
        students.add(studentas4);
        students.add(studentas2);

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println("Vardas: " + student.name + " " + "Pavarde: " + student.surname);

            for (int a = 0; a < student.grades.size(); a++) {
                int grade = student.grades.get(a);
                System.out.println(" pazymiai:" + grade + ".");

            }
        }


    }
}