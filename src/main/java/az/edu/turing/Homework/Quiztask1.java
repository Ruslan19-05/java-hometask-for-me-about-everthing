package az.edu.turing.Homework;

import java.util.Scanner;

public class Quiztask1 {

    public static void main(String[] args) {
        //input
        Scanner sc=new Scanner(System.in);
        int [] arr1 ={1,2,3};
        int [] arr2={4,5,6};
        int [] arr3=new int [arr1.length];
        for(int i=0;i<=2;i++){
            arr3[i]=arr3[i]+(arr2[i]+arr1[i]);
           // System.out.print(arr3[i] +" ");
        }
        for(int r:arr3){
            System.out.print(r+" ");
        }
    }
}

