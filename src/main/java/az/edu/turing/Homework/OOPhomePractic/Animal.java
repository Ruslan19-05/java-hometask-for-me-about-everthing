package az.edu.turing.Homework.OOPhomePractic;

public class Animal {

    private int head;
    private String name;
    private String gender;


    public Animal(int head,String name,String gender){
        this.head=head;
        this.name=name;
        this.gender=gender;
    }

    public int getHead(){
        return head;
    }

    public String getName(){
        return name;
    }

    public  String getGender(){
        return gender;
    }

    public void setHead(int head){
        this.head=head;
    }

    public void setName(String names){
        this.name=names;
    }

    public void setGender(String gender){
        this.gender=gender;
    }

    public String toString(){
        return head+","+name+","+gender;
    }
}
