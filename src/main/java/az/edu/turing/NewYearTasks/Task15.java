package az.edu.turing.NewYearTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size for arrays :");
        int size=sc.nextInt();
        System.out.println("Enter numbers for first array:");
        int[] firstArray=new int[size];
        enterArraysNumber(firstArray);
        //*******************************************
        System.out.println("Enter numbers for second array:");
        int[] secondArray=new int[size];
        enterArraysNumber(secondArray);

        sumOfArray(firstArray,secondArray);

    }

    public static void enterArraysNumber(int[] array){
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
    }

    public static void sumOfArray(int[] array1,int[] array2){

        int[] newArray=new int[array1.length];

        for(int i=0;i<array1.length;i++){
            newArray[i]=array1[i]+array2[i];
        }

        System.out.println(Arrays.toString(newArray));
    }
}
