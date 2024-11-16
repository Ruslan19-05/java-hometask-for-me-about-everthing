package az.edu.turing.Homework;

import java.util.Scanner;

public class Methodsmultiplicationtaple8 {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int number=sc.nextInt();
        mulitpicant(number);
    }

    public static int mulitpicant(int a){
        for(int i=1;i<=10;i++){
            System.out.println(a+"x"+i+"="+a*i);
        }
        return a;
    }
}
