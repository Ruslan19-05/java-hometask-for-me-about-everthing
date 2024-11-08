package az.edu.turing.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysApp3 {

    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
        int[] ruslan1 = new int[4];
        int [] ruslan2={1,2,4,7,8,3,4,5};
        int start=0;
        int temp;
        int end =ruslan2.length-1;
        //prosess
        while(start<end){
            temp =ruslan2[start];
            ruslan2[start]=ruslan2[end];
            ruslan2[end]=temp;
            start++;
            end--;
        }
        //output
        System.out.println(Arrays.toString(ruslan2));

    }
}
