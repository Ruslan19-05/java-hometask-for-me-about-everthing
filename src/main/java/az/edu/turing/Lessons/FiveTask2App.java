package az.edu.turing.Lessons;

import java.util.Scanner;

public class FiveTask2App {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println(chekMax(arr1));

    }

    public static int chekMax(int []arr2){
        int max=arr2[0];

        for(int i=1;i<arr2.length-1;i++){
            if(arr2[i-1]<arr2[i] && arr2[i]>arr2[i+1]){
                max=arr2[i];
            }
        }

        return max;
    }
}
