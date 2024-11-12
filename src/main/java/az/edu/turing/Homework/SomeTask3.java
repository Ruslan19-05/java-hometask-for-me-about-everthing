package az.edu.turing.Homework;

import java.util.Arrays;

import java.util.Scanner;

public class SomeTask3 {

    public static void main(String[] args) {
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Add arr1 size: ");
        int size =sc.nextInt();
        int [] arr1=new int[size];
        int min=arr1[0],max=0;
        //prosess
        for(int i=0;i<size;i++){
            System.out.print("Add to arr1 numbers itself: ");
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(max<arr1[i]){
                max=arr1[i];
            }
            if(min>arr1[i]){
                min=arr1[i];
            }
        }
        //output
        System.out.println(Arrays.toString(arr1));
        System.out.println("Max number: "+ max);
        System.out.print("Min number: " + min);
    }
}
