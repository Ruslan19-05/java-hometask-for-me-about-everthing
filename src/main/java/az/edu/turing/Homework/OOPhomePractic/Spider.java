package az.edu.turing.Homework.OOPhomePractic;

public class Spider extends Animal{

    private int leg;

   public Spider(int head,String names,String gender,int leg){
       super(head,names,gender);
       this.leg=leg;
    }

    public int getLeg(){
       return leg;
    }

    public  void setLeg(int leg){
       this.leg=leg;
    }
}
