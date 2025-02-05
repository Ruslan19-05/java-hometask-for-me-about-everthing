package az.edu.turing.sorting;

public class PracticSorting {

    public static void main(String[] args) {

        sayHi(5);
    }

    public static void sayHi(int count){
        System.out.println("HI!");

        if(count<=1){
            return;
        }
        sayHi(count-1);

    }
}
