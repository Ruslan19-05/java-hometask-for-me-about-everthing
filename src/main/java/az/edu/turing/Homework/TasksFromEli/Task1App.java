package az.edu.turing.Homework.TasksFromEli;

import java.util.Scanner;

public class Task1App {

    public static void main(String []args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size:");
        int size=sc.nextInt();
        int [] arr= new int[size];
        System.out.print("Enter array numbers:");
        System.out.print(sumArray(arr));
    }

    public static void inputArray(int[] array){

        Scanner scanner=new Scanner(System.in);
        for(int j=0;j<array.length;j++){
            array[j]=scanner.nextInt();
        }
    }

    public static int sumArray(int[] arr1){

        inputArray(arr1);
        int sum=0;

        for(int num:arr1){
            sum+=num;
        }
        return sum;
    }
}
