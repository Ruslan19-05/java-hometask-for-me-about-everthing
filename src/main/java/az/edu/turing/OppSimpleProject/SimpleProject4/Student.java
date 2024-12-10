package az.edu.turing.OppSimpleProject.SimpleProject4;

import java.util.Objects;

public class Student extends Person implements SoundS{

    private int grade;
    private int studentId;

    public Student(String name,int age,int grade,int studentId){
        super(name,age);
        this.grade=grade;
        this.studentId=studentId;
    }

    public int getGrade(){
        return grade;
    }

    public int getStudentId(){
        return studentId;
    }

    public void setGrade(int grade){
        this.grade=grade;
    }

    public void setStudentId(int studentId){
        this.studentId=studentId;
    }

    @Override
    public void soundStudents(){
        System.out.println("OKAY Teacherr!");
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Grade:"+grade+"\n"+"StudentID:"+studentId);
    }

    @Override
    public int hashCode(){
        return Objects.hash(grade,studentId);
    }
}
