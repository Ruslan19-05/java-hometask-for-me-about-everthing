package az.edu.turing.Generics;

public class Box <T>{

    private T content;

    public void setContent(T content){

        this.content=content;
    }

    public T getContent(){
        return content;
    }

}
