package az.edu.turing.Homework.Tasks120;

import java.util.Scanner;

public class Hard5AppPerfix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size:");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = scanner.nextLine();
        }
        String perifx=strs[0];
        for (int i = 0; i < strs.length; i++) {
                 while(strs[i].indexOf(perifx) !=0){
                    perifx=perifx.substring(0,perifx.length()-1);
                    if(perifx.isEmpty()){
                        System.out.println(" ");
                        break;
                    }
                }
        }
        System.out.println(perifx);
    }
}


