package az.edu.turing.Lessons;

import java.util.Scanner;

public class FiveTaskApp {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double salary;
        double maxSlaray=-1;
        while (scanner.hasNext()){
            salary= scanner.nextDouble();
            if(maxSlaray<salary){
                maxSlaray=salary;
            }
        }
        System.out.printf("%.2f",maxSlaray);
    }
}
