package az.edu.turing.quiz9_10;

public class ExceptionApp {

    public static void main(String[] args) {

        try{
            String text="Turing Academy";
            System.out.println(text);
        }catch (IllegalArgumentException e){
            System.out.println("Hello");
        }

        System.out.println("Hello");
    }
}
