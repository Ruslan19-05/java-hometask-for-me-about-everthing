package az.edu.turing.Homework;

import java.util.Scanner;

public class ArraysApp2 {

    public static void main(String[] args) {
        //input
        System.out.println("Enter your arrays: ");
        Scanner scanner=new Scanner(System.in);
        int size =scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("add elemensts: ");
        int sum=0;
        int average=0;
        int n=0;
        //prosess
        for(int a=0;a<arr.length;a++){
            arr[a]=scanner.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            n++;
        }
        average=sum/n;
        System.out.println(sum);
        System.out.println(average);
    }
}
