package az.edu.turing.OOP;

public class Mainer {

    public static void main(String[] args){

        Animal heyvan=new Cat("Miri",18,"light pink");
        System.out.println(heyvan.toString());

        Animal Mircavad=new DOG("Miri",18,"female");
        System.out.println(Mircavad.toString());
    }
}
