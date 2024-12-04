package az.edu.turing.Homework.OOPhomePractic;

public class Donkey extends Animal{

    private int tail;

    public Donkey(int head,String names,String gender,int tail){
        super(head,names,gender);
        this.tail=tail;

    }

    public int getTail(){
        return tail;
    }

    public void setTail(int tail ){
        this.tail=tail;
    }
}
