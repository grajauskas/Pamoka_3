import javax.swing.*;
import java.util.ArrayList;

public class Student {
    String surname;
    String name;
    int age;
    ArrayList<Integer> grades;

    public Student() {
        this.grades = new ArrayList<>();

    }

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.grades = new ArrayList<>();

    }


}


