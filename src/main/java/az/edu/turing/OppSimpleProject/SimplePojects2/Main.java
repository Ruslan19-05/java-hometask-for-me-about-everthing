package az.edu.turing.OppSimpleProject.SimplePojects2;

import az.edu.turing.OppSimpleProject.SimplePojects2.FoodProduct;

public class Main {

    public static void main(String[]args){

        FoodProduct product1=new FoodProduct("Alma",200,5,"23.2.2025");
        ElectronicProduct product2= new ElectronicProduct("Tozsoran",1000,3,"43255.5245");

        product1.displayInfo();
        System.out.println();
        product2.displayInfo();
        System.out.println();

        System.out.println("-------------------");
        product1.sell(2);
        product2.sell(1);
        System.out.println();

        System.out.println("---------------------");
        product1.restock(20);
        product2.restock(3);
        System.out.println();

        System.out.println("-----------------------");
        product1.displayInfo();
        System.out.println();
        product2.displayInfo();
    }
}
