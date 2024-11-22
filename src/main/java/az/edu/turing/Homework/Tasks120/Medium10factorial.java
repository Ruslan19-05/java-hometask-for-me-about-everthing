package az.edu.turing.Homework.Tasks120;

import java.util.Scanner;

public class Medium10factorial {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int f=sc.nextInt();
        int i=1;
        int b=1;
        while(f>1 && i<=2000){
            b=b*i;
            i++;
            f=f/i;
        }
        System.out.print(i);
    }
}
