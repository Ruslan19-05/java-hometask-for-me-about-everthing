package az.edu.turing.Generics;

import java.util.ArrayList;

public class GenericsExample {

    public static void main(String[]args){
        shout("John",78);

    }

    private static <DG,V> DG  shout(DG thingToShout,V otherThingShout){
        System.out.println(thingToShout+"!!!!!");
        System.out.println(otherThingShout+"!!!!");
        return thingToShout;
    }
}
