package az.edu.turing.NewYearTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task17 {

    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size for Array:");
        int size=sc.nextInt();
        System.out.println("Enter array number:");
        int[] array=new int[size];

        enterArray(array,sc);
        sortArray(array);
    }

    public static void enterArray(int[]array,Scanner sc){

        for(int i=0;i<array.length;i++){

            array[i]=sc.nextInt();
        }
    }

    public static void sortArray(int[]array){

        for(int i=0;i<array.length;i++){
            int minIndex=i;

            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[minIndex]){
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                int temp=array[i];
                array[i]=array[minIndex];
                array[minIndex]=temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
