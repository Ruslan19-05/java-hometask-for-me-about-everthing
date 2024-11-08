package az.edu.turing.Lessons;

import java.util.Scanner;

public class ArraysApp {

    public static void main(String[] args) {
        // max ededi tap

        int[] numbers={1,2,3,4,5,6,7,8};
        int max=numbers[0];
        for(int i=0;i<numbers.length;i++) {
            if (  numbers[i]>max) {
                max=numbers[i];
            }
        }
        System.out.println(max);



    }
}
