package az.edu.turing.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysApp5 {

    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
        int [] ruslan05= new int[4];
        ruslan05[0]=5;
        ruslan05[1]=1;
        ruslan05[2]=2;
        ruslan05[3]=3;

        int [] b={4,5,7,78};
        int [] c=new int [ruslan05.length+b.length];
        for(int i=0;i<ruslan05.length;i++){
            c[i]=ruslan05[i];
        }
        for(int j=0;j<b.length;j++){
            c[ruslan05.length+j]=b[j];
        }
        System.out.println(Arrays.toString(c));

    }
}
