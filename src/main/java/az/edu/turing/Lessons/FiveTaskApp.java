package az.edu.turing.Lessons;

import java.util.Scanner;

public class FiveTaskApp {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count= scanner.nextInt();
        int[] n= new int[count];

        if(count >=2) {
            inputWorker(n);
            checkBig(inputWorker(n));
        }

    }


    public static int[] inputWorker(int[] n){
        Scanner scanner=new Scanner(System.in);
        if(n.length>=2){
            int [] worker=new int[n.length];
            for(int i=0;i<n.length;i++){
                   worker[i]= scanner.nextInt();
            }
        }else {
            System.out.print("Wrong num");
        }
        return n;
    }

    public static void checkBig(int[] worker){
        int max=worker[0];
        for(int i=1;i<worker.length;i++){
            if(max<worker[i]){
                max=worker[i];
            }
        }
        System.out.println(max);
    }


}
