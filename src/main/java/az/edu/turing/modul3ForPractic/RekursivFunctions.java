package az.edu.turing.modul3ForPractic;

public class RekursivFunctions {

    public static void main(String[] args) {

        int num = 5;
        int count=4;
        System.out.println(factorial(num,count));
    }

    public static int factorial(int i,int b) {

        if (b == 0) {
                return 1;
            } else {
                return i*factorial(i,b-1);
            }
        }
}
