package az.edu.turing.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysApp4 {

    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
        int [] ruslan05= new int[4];
        ruslan05[0]=5;
        ruslan05[1]=1;
        ruslan05[2]=2;
        ruslan05[3]=3;

        int [] b={4,5,7,78};
        int start=0;//int [] a =Arrays.copyOf(ruslan05,ruslan05.length);
        //prosess
       // System.out.println(Arrays.toString(a));
        for(int i=0;i<ruslan05.length;i++){
            b[start]=ruslan05[i];
            start++;
        }
        System.out.print(Arrays.toString(b));

    }
}
