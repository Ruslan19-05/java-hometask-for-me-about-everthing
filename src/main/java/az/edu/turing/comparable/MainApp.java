package az.edu.turing.comparable;

import java.util.function.Consumer;

public class MainApp {

    public static void main(String[] args) {



         String str="Hello";
        Consumer<String> consumer= System.out::print;


        for(int i=str.length()-1;i>=0;i--){
            consumer.accept(String.valueOf(str.charAt(i)));
        }
    }
}

