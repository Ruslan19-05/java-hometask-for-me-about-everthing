package az.edu.turing.Homework.Tasks120;

import java.util.Scanner;

public class Medium2App {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=1;
        for(int i=1;i<k;i++){
            for(int j=1;j<k;j++){
                n=n*i*j;
            }
        }
        System.out.print(n);
    }
}
