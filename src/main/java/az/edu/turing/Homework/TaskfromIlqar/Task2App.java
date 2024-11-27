package az.edu.turing.Homework.TaskfromIlqar;

import java.util.Arrays;
import java.util.Scanner;

public class Task2App {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int b=m*n;
        int[][] arr=new int[n][m];
        for(int i=n-1;i>=0;i--) {
            for (int j = m-1; j>=0; j--) {
                arr[i][j] = b-- ;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
