package az.edu.turing;

import java.util.Scanner;
import java.util.Random;

public class ArrayApp01 {

    public static void main(String[] args) {

        int[] num={5,6};
        int a=5;
        int cem = sum(num,a);
        System.out.println(cem);
    }
    public static int sum(int[] vekils,int a){
        return vekils[0]+vekils[1];
    }
}
