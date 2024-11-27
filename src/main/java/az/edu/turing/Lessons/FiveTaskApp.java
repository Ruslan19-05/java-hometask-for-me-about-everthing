package az.edu.turing.Lessons;

import java.util.Scanner;

public class FiveTaskApp {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count= scanner.nextInt();
        if(count>=2) {
            double[] salary = new double[count];

            for (int i=0;i<count;i++){
                salary[i]= scanner.nextInt();
            }
            checkBig(salary);


        }
    }
    public static void checkBig(double[] worker){
        double max=worker[0];
        for(int i=1;i<worker.length;i++){
            if(max<worker[i]){
                max=worker[i];
            }
        }
        System.out.println(max);
    }


}
