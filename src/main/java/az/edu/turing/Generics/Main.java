package az.edu.turing.Generics;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        DataManager<String> stringDataManager=new DataManager<>();
        stringDataManager.addData("Ruslan");
        stringDataManager.addData("Cherkezov");
        stringDataManager.printAllData();

        DataManager<String> integerDataManager=new DataManager<>();

        integerDataManager.addData("dbewyfh");
        integerDataManager.addData("ewbne");
        integerDataManager.printAllData();

        System.out.println("Indeks 0:"+stringDataManager.getData(0));
    }
}
