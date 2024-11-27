package az.edu.turing.Lessons;

import javax.sound.midi.Soundbank;
import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

public class FiveTask3App {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>0;j--){
                if(i>j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("-----");
        for(int i=n;i>=0;i--){
            for(int j=1;j<=n;j++){
                if(i<j){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
