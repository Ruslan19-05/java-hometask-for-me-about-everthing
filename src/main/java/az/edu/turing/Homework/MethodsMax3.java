package az.edu.turing.Homework;

import java.util.Scanner;

public class MethodsMax3 {

    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.print("a:");
        int a=sc.nextInt();
        System.out.print("b:");
        int b=sc.nextInt();
        System.out.print("c:");
        int c=sc.nextInt();
        int boyukeded=findMax(a,b,c);
        System.out.println("boyuk eded:"+boyukeded);
    }
    public static int findMax(int a,int b,int c) {
        int max;
        if (a > b && a > c) {
             max=a;
        } else if (a < b && b > c) {
             max=b;
        } else {
             max=c;
        }
        return max;
    }
}
