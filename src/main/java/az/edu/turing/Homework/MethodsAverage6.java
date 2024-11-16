package az.edu.turing.Homework;

import java.util.Scanner;

public class MethodsAverage6 {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int d=sc.nextInt();
        System.out.print("Enter second number: ");
        int e=sc.nextInt();
        float cem=avereage(d,e);
        System.out.print("ededlerin orta qiymeti: "+cem);
    }

    public static float avereage(float a,float b){
        float areage=(a+b)/2;
        return areage;
    }
}
