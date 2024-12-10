package az.edu.turing.OppSimpleProject.SimpleProject4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Mikel", 30, "Math", 123);
        Teacher teacher2 = new Teacher("Sara", 29, "Biology", 456);
        Student student1 = new Student("Zekir", 16, 10, 111);
        Student student2 = new Student("Mora", 18, 12, 222);
        Teacher manner = new Teacher("Messi",33,"FGHSHFJGS",43545);
        Person oyarzabl=new Teacher("MIgelancelo",99,"Madagaskar history",7876);

        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher1);
        teachers.add(teacher2);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        System.out.println(teachers);
        System.out.println(students);

        teacher2.setSubject("Phishics");
        student1.setAge(13);
        teacher2.displayInfo();
        teacher1.soundTeachers();
        student1.soundStudents();
        manner.displayInfo();
        System.out.println();
        oyarzabl.displayInfo();
    }
}
