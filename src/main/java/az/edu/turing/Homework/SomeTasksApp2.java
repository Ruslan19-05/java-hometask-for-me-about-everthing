package az.edu.turing.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class SomeTasksApp2 {

    public static void main(String[] args) {
        //input
        Scanner sc =new Scanner(System.in);
        int [] arr1=new int[3];
        int [] arr2=new int[3];
        int [] arr3=new int[6];
        for(int a=0;a<=2;a++){
            System.out.print("Add arr1 numbers: ");
            arr1[a]=sc.nextInt();
        }for(int a=0;a<=2;a++){
            System.out.print("Add arr2 numbers: ");
            arr2[a]=sc.nextInt();
        }
        for(int i=0;i<=2;i++){
            arr3[i]=arr3[i]+arr1[i];
        }
        for(int j=0;j<=2;j++){
            arr3[3+j]=arr3[3+j]+arr2[j];
        }
        System.out.print(Arrays.toString(arr3));
    }
}
