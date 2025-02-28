package az.edu.turing.modul3ForPractic;

import java.util.HashMap;
import java.util.Map;

public class DiamondOperatorExample {

    public static void main(String[] args) {

        Map<Integer,String> stringMap=new HashMap<>();
        stringMap.put(1,"RESAHD");
        stringMap.put(2,"Malik");

        for(Map.Entry<Integer,String>entry:stringMap.entrySet()){
            System.out.println("id:"+entry.getKey()+",ad:"+entry.getValue());
        }
    }
}
