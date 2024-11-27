package az.edu.turing.Lessons;

import java.util.Scanner;

public class FiveTask4App {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter count:");
        int s=scanner.nextInt();
        int[] n=new int[s];

        for(int i=0;i<s;i++){
            System.out.print("enter arr num"+i +":");
            n[i]= scanner.nextInt();
        }
        System.out.println(chekMax(n));

    }

    public static int chekMax(int []n){
        int max=n[0];
        int s=0;

        for(int i=1;i<n.length;i++){
            if(max<n[i]){
                max=n[i];
                s=i;
            }
        }
        System.out.println(s);
       return max;
    }
}
