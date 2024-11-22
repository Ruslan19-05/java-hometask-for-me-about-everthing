package az.edu.turing.Homework;

import java.util.Scanner;

public class MethodsReversed2 {

    public static int reverseString(int str){
        int reversed=0;
        while(str>0){
            reversed=reversed*10+(str%10);
            str=str/10;
        }
        return reversed;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int  original=sc.nextInt();
        int ters=reverseString(original);
                System.out.println(ters);
    }
}
