package az.edu.turing.modul3ForPractic;

import  java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        Optional<String>optional1=Optional.of("Ruslan");
        System.out.println(optional1.get());

        Optional<String> optional2=Optional.empty();
        System.out.println(optional2.isPresent());

        Optional<String>optional3=Optional.ofNullable(null);
        System.out.println(optional3.orElse("Default value"));
        System.out.println(optional3.orElseGet(()-> "Generated value"));
        System.out.println(optional3.orElseThrow(()->new IllegalArgumentException("Not found value")));
    }
}
