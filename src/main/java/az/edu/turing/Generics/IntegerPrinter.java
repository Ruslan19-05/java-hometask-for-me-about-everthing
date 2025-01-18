package az.edu.turing.Generics;

import az.edu.turing.Quiz5.Animal;

import java.io.Serializable;

public class IntegerPrinter <DG ,V> {

    DG thingToPoint;
    V otherThingToPoint;

    public IntegerPrinter(DG thingToPoint){
        this.thingToPoint=thingToPoint;
    }

    public void print(){
        System.out.println(thingToPoint);
    }
}
