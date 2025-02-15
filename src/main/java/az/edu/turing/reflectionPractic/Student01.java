package az.edu.turing.reflectionPractic;

import java.io.Serializable;

public class Student01 implements Serializable {

    private static long serialVersionUID=5L;
    private String name;
    private double age;

    public Student01(String name, double age) {
        this.name = name;
        this.age = age;
    }
}
