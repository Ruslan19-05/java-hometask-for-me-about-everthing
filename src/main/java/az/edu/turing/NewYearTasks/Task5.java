package az.edu.turing.NewYearTasks;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        int [] array=addNumberInArray();
        sumAndCount(array);
    }

    public static int[] addNumberInArray(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size for Array:");
        int size=sc.nextInt();
        System.out.println("Enter Array:");
        int[] array=new int[size];

        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }

        return array;
    }

    public static void sumAndCount(int[] array){

        int sum=0;
        int count=0;

        for(int num:array){
            sum+=num;
            count++;
        }

        System.out.println("Sum for number:"+sum);
        System.out.println("Count for number:"+count);
    }
}
