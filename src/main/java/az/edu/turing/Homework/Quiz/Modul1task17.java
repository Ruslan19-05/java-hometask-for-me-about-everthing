package az.edu.turing.Homework.Quiz;

import java.util.Scanner;

public class Modul1task17 {
     //TASK17
//    public static void main(String[] args) {
//        String text="AB";
//        System.out.println(textRepeater(text,4));
//    }
//
//    public static String textRepeater(String text,int reps){
//        String repText="";
//        for(int i=0;i<reps;i++){
//            repText+=text;
//        }
//        return repText;
//    }
    //TAK19
//    public static void main(String[] args) {
//        int [] myArray={2,3,6,-2,7,12,-6,9};
//        int  a=findmax(myArray);
//        System.out.println(a);
//    }
//
//    public static int findmax(int[] a){
//        int max=a[0];
//        for(int i=0;i<a.length;i++){
//                if(max<a[i]){
//                    max=a[i];
//                }
//        }
//        return max;
//    }
            //TASK19
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int size=sc.nextInt();
         printTringle(size);
     }
     public static void printTringle(int a){

         for(int i=0;i<a;i++){
             for(int j=a;j>=0;j--){
                 if(i<j){
                     System.out.print(" ");
                 }else{
                     System.out.print("*");
                 }
             }
             System.out.println();
         }
//         for(int i=0;i<=4;i++) {
//             for (int j = 0; j < 5; j++) {
//                 if(j==1 && i==1 || j==3 && i==1){
//                 System.out.print(" []");
//                }else if(j==4 && i==1){
//                    continue;
//                 }else if(j==2 && i==4){
//                     System.out.print(" []");
//                 } else if(j==3 && i==4) {
//                     System.out.print("X");
//                 }else{
//                     System.out.print(" X");
//             }
             //}
             //System.out.println();
       //  }
     }


}
