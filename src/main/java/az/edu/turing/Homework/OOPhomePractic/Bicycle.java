package az.edu.turing.Homework.OOPhomePractic;

public class Bicycle extends Vehicle{

       private  int wheels;
       private int pedals;

       public Bicycle(double speed,String model,String name,int wheels,int pedals){
              super(speed,model,name);
              this.wheels=wheels;
              this.pedals=pedals;
       }

       public int getWheels(){
              return wheels;
       }

       public void setWheels(int wheels){
              this.wheels=wheels;
       }

       public int getPedals(){
              return pedals;
       }

       public void setPedals(int pedals){
              this.pedals=pedals;
       }

       @Override
       public void go(){
              System.out.println("This speed "+getSpeed() +" km/hour");
       }
       public void stop(){
              System.out.println("This bike is stop");
       }

       public String toString(){
              return getSpeed()+"<"+getModel()+"<"+getName()+"<"+wheels+"<"+pedals;
       }
}
