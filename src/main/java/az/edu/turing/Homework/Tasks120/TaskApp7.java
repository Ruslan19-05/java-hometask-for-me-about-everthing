package az.edu.turing.Homework.Tasks120;

import java.util.Scanner;

public class TaskApp7 {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Sernisinlerin sayi:");
        int count=sc.nextInt();
        int ticket=sc.nextInt();
        int n=0;
        int i=0; 
        for( i=ticket+1;i<count;i++){
            for(int j=1;j<i;j++){
               if(i%j==0){
                   n++;
               }
            }
        }
        if(n==2) {
            System.out.print(i-ticket);
        }
    }
}
