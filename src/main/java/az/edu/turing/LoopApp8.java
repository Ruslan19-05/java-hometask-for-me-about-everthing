package az.edu.turing;

import java.util.Scanner;

public class LoopApp8 {

    public static void main(String[] args) {
    //input
        System.out.println("eded daxil et: ");
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=0;
        int c=0;
        int d=0;
            if (a > 0) {
                c=a%10;
                d=a/100;
                a = a / 10;
                b = a % 10;
            }
            System.out.print("A big number: ");
            if(c>b && c>d){
                System.out.println(c);
            }else if(b>c && b>d){
                System.out.println(b);
            }else
                System.out.println(d);
    }
}
