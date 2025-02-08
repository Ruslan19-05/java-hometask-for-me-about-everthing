package az.edu.turing.InLesson.mapProject;

import java.util.HashMap;
import java.util.Map;


public class StudentApp {

    public static void main(String[] args) {

        Map<Student,String> map=new HashMap<>();

        map.put(new Student("Ruslan",1L),"A");
        map.put(new Student("dhf",2L),"B");
        map.put(new Student("MaYKL",3L),"C");


        map.forEach((k, v) -> {
            if ("A".equals(v)) {
                System.out.println(  k);
            }
        });
    }
}
