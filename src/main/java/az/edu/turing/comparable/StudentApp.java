package az.edu.turing.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentApp {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Zurafe", 699));
        students.add(new Student("Zebra", 698));
        students.add(new Student("Antilop", 697));


        System.out.println("Orjinal siyahi:"+students);

        Comparator<Student> byScore=(s1,s2)-> Integer.compare(s2.score,s1.score);

        Collections.sort(students,byScore);
        System.out.println("bala gore siralanuib:"+students);

    }
}
