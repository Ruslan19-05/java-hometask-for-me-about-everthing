package az.edu.turing.NewYearTasks;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=sc.nextInt();
        int[] array=new int[size];
        enterArray(array);
        findMax(array);
        findAverage(array);

    }

    public static void enterArray(int [] array){

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
    }

    public static void findMax(int[] array){

        int max=array[0];
        int min=array[0];

        for(int i=1;i<array.length;i++){

            if(max<array[i]){
                max=array[i];
            }

            if(min>array[i]){
                min=array[i];
            }
        }

        System.out.println("Array number for Max:"+max);
        System.out.println("Array number for Min:"+min);
    }

    public static void findAverage(int [] array){

        int sum=0;
        int n=0;

        for(int num:array){
            sum+=num;
            n++;
        }

        System.out.println("Average for Array:"+sum/n);
    }
}
