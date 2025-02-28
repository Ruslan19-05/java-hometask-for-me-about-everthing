package az.edu.turing.quiz9_10;

public class Box <E>{

    E data;

    public Box(E data){
        this.data=data;
    }

    public E getData(){
        return data;
    }
}
