package az.edu.turing.Homework.Tasks120;

import java.util.Scanner;

public class Additional4App {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={1,1,3,4,0};
        int b=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;i<a.length;i++) {
                if (a[i] > a[j]) {
                    b = a[i];
                }
            }
        }
        System.out.print(b+1);
    }
}
