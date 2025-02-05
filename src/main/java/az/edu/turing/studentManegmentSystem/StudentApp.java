package az.edu.turing.studentManegmentSystem;

import java.util.*;

public class StudentApp {

    public static void main(String[] args) {

        List<Student> Astudents=new ArrayList<>();

        List<Student> Lstudents=new LinkedList<>();

        Astudents.add(new Student(1L,"Ruslan",19,2.5,false));
        Astudents.add(new Student(1L, "Ali", 20, 85.5, false));
        Astudents.add(new Student(2L, "Leyla", 22, 90.0, true));
        Astudents.add(new Student(3L, "Murad", 21, 88.0, false));
        Astudents.add(new Student(4L, "Samir", 23, 75.0, true));


        for(Student s:Astudents){
            if(s.isDebt()){
                Lstudents.add(s);
            }
        }


        Astudents.forEach(System.out::println);

        System.out.println("--------");
        Lstudents.forEach(System.out::println);

        Set<String> Acourse=new HashSet<>();

        Student s1 = new Student(6L, "Alik");
        Student s2 = new Student(8L, "Malik");
        Student s3 = new Student(9L, "Mikayil");

        Set<String> s1Courses = new HashSet<>(Arrays.asList("Java", "Python", "Cyber Security"));
        Set<String> s2Courses = new HashSet<>(Arrays.asList("Python", "Web Development"));
        Set<String> s3Courses = new HashSet<>(Arrays.asList("Java", "Machine Learning"));
        Acourse.addAll(s1Courses);
        Acourse.addAll(s2Courses);
        Acourse.addAll(s3Courses);

        System.out.println("Bütün kurslar (təkrarlanmayan):");
        Acourse.forEach(System.out::println);

    }
}
