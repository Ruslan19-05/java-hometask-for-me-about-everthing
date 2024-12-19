package az.edu.turing.OOP;

public interface DogInterfaces {

    static void bark(){
        System.out.println("Cat is barked!");
    }
   default void poop(){

       System.out.println("Cat is pooped!");
   }
}
