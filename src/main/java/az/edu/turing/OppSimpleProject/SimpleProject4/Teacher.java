package az.edu.turing.OppSimpleProject.SimpleProject4;

public class Teacher extends Person implements Sound {

    private String subject;
    private int teacherId;

    public Teacher(String name,int age,String subject,int teacherId){
        super(name,age);
        this.subject=subject;
        this.teacherId=teacherId;
    }

    public String getSubject(){
        return subject;
    }

    public int getTeacherId(){
        return teacherId;
    }

    public void setSubject(String subject){
        this.subject=subject;
    }

    public void setTeacherId(int teacherId){
        this.teacherId=teacherId;
    }

    @Override
    public void soundTeachers(){
        System.out.println("Keep quite!");
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Subject:"+subject+"\n"+"TeacherId:"+teacherId);
    }

    @Override
    public String toString(){
        return "Subject--"+subject+"\n"+"TeacherID--"+teacherId ;
    }
}
