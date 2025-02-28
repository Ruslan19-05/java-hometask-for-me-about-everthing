package az.edu.turing.modul3ForPractic;

import java.util.ArrayList;
import java.util.List;

public class WithGenerics {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Ruslan");
        list1.add("Nsrn");

        for(String str:list1){
            System.out.println(str);
        }
    }
}
