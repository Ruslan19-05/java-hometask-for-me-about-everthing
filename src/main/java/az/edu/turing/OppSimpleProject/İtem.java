package az.edu.turing.OppSimpleProject;

import java.util.Objects;

public class İtem {

    private String title;
    private int id;
    public boolean borrowed;

    public İtem(String title,int id,boolean borrowed){
        this.title=title;
        this.id=id;
        this.borrowed=false;
    }

    public String getTitle(){
        return title;
    }

    public int getId(){
        return id;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public void setId(int id){
        this.id=id;
    }

    public void borrowItem(){
        if(!borrowed){
            borrowed=true;
            System.out.println(title+" is borrowed.");
        }else{
            System.out.println(title+" is already borrowed");
        }
    }

    public void returnItem(){
        borrowed=false;
        System.out.println(title+" is returned");
    }

    public void displayInfo(){
        System.out.println("Id:"+id+"\n"+"Title:"+title+"\n"+"Borrowed:"+borrowed);
    }

    @Override
    public String toString(){
        return title+"--"+id+"--"+borrowed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        İtem i̇tem = (İtem) o;
        return id == i̇tem.id && borrowed == i̇tem.borrowed && Objects.equals(title, i̇tem.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title,id,borrowed);
    }
}
