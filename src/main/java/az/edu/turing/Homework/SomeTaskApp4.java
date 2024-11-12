package az.edu.turing.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class SomeTaskApp4 {

    public static void main(String[] args) {
        //input
        Scanner sc=new Scanner(System.in);
        int [] arr1=new int[3];
        int [] arr2=new int[3];
        int [] arr3=new int [3];
        for(int a=0;a<=2;a++){
            System.out.print("Add arr1 numbers: ");
            arr1[a]=sc.nextInt();
        }for(int a=0;a<=2;a++){
            System.out.print("Add arr2 numbers: ");
            arr2[a]=sc.nextInt();
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr1[i]==arr2[j]){
                    arr3[i]=arr3[i]+arr1[i];
                }
            }
        }
        System.out.print(Arrays.toString(arr3));
    }
}
