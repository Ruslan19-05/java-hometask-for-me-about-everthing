package az.edu.turing.modul3ForPractic;

public class GenericsClassExample {

    public static void main(String[] args) {

        Box<String> stringBox=new Box<>();
        stringBox.setValue("Hello");
        System.out.println(stringBox.getValue());

        Box<Integer> integerBox=new Box<>();
        integerBox.setValue(59);
        System.out.println(integerBox.getValue());
    }
}
