package az.edu.turing;

import java.util.Scanner;

public class LoopApp6 {

    public static void main(String[]args){
        //input
        Scanner scanner= new Scanner(System.in);
        //prosess
        for(int number=1;number<20;number++) {
            if (number % 5 == 0 || number % 7 == 0){
                continue;
        }
            System.out.print(number +" ");
        }
    }
}
