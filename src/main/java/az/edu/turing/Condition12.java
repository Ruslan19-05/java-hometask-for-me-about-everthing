package az.edu.turing;

import java.util.Scanner;

public class Condition12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
      /*  String a=scanner.nextLine();
        String b= new StringBuilder(a).reverse().toString() ;
        System.out.println("reversed: "+b);

        String c="Salam my name is Ruslan";
        String d=new StringBuilder(c).reverse().toString();
        System.out.println("reversed sentence: "+d);
*/
        String a=scanner.nextLine();
       // String r=scanner.nextLine();
        //String herif="i";
       // System.out.println("Boyuk herifle yazmaq: " +(a).toUpperCase());
       // System.out.println("Balaca herifle yazmaq: "+(a).toLowerCase());
        //System.out.println("ilk herif: "+(a).charAt((a).length()-1));
       /* if(a.indexOf(herif)!=-1){
            System.out.println("Setirde " + herif + " herfi var");
        }else {
            System.out.println("Yoxdur bu herif");
        }*/
        //System.out.println((a).concat(r));
        //System.out.println(a+" "+r);
        if(a.contains(" ")){
            System.out.println("Var");
        }else{
            System.out.println("Yoxdur");
        }
    }
}
