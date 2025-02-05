package az.edu.turing.studentManegmentSystem;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {

    private Long id;
    private String name;
    private Integer age;
    private Double grade;
    private boolean debt;

    public Student(Long id, String name, Integer age, Double grade,boolean debt) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.debt=debt;
    }

    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setDebt(boolean debt) {
        this.debt = debt;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;

    }

    public boolean isDebt() {
        return debt;
    }

    @Override
    public int compareTo(Student other) {
        return Long.compare(this.id, other.id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return Objects.equals(id, student.id);
    }

    @Override
    public String toString(){
        return id+"-*-"+name+"(Age:"+age+",grade:"+grade+")";
    }

    public static Comparator<Student> nameComp=Comparator.comparing(Student::getName);

    public static Comparator<Student> ageComp=Comparator.comparing(Student::getAge);

    public static Comparator<Student> gradeComp=Comparator.comparing(Student::getGrade);
}
