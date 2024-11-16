package az.edu.turing.Homework;

import java.util.Scanner;

public class MethodsMaxaverage11 {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        System.out.print("Enter second number:");
        int b=sc.nextInt();
        System.out.print("Enter thrid number:");
        int c=sc.nextInt();
        int max=bigaverage(a,b,c);
        System.out.print("The biggest number average:"+max/2);
    }

    public static int bigaverage(int a,int b,int c){
        int enboyuk;
         if(a>b && a>c){
            enboyuk=a;
         }else if(a<b && c<b){
             enboyuk=b;
         }else{
             enboyuk=c;
         }
         return enboyuk;
    }
}
