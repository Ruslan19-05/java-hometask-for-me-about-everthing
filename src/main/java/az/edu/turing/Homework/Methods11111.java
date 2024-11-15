package az.edu.turing.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Methods11111 {

    public static void main(String[]args) {
//        Scanner scanner = new Scanner(System.in);
//           int[][] arr12 = new int[3][3];
////        int [] arr3= new int [arr12.length];
////        int[] arr1 = {1, 2, 3, 4, 5};
//            for (int i = 0; i < arr12.length; i++) {
//                    for(int j=0;j<arr12.length;j++){
//                        arr12[i][j]=scanner.nextInt();
//                        System.out.println(arr12[i][j]);
//                    }
//
//        }
//        for (int number : arr1) {
//            System.out.print(number + ",");
//        }
//        System.out.println();
//        for (int j = 0; j < arr12.length; j++) {
//            arr12[j]=scanner.nextInt();
//            arr3[j]=arr3[j]+arr12[j];
//        }
//        System.out.println(Arrays.toString(arr3));
//        int [] arr1={1,2,3,4,5,6};
//        int min=arr1[3];
//        int [] arr2=Arrays.copyOf(arr1,arr1.length);
//        int number=Arrays.binarySearch(arr1,5);
//        for(int i=0;i<arr1.length;i++){
//            if(min>arr1[i]){
//                min=arr1[i];
//            }
//        }
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(number);
////        System.out.println(min);
//        sum(1,2);
//
//        System.out.print(sum(1,2)+ sum(11,35));
//    }
//    public static int sum(int x,int y){
//
//        int sum=x+y;
//        return sum;
//
//        char [] arr={'h','e','l','l','o'};
//        String str=new String(arr);
//        System.out.print(str);
        int [][] matrix = new int [3][2];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=(i+j)*2;
            }
        }
        System.out.println(Arrays.toString(matrix));
        System.out.println(matrix[2][1]+matrix[1][1]);
   }

}




