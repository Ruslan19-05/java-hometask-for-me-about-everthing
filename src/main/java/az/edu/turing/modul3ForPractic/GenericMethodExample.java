package az.edu.turing.modul3ForPractic;

public class GenericMethodExample {

    public static <T>void printArray(T[]array){
        for(T element:array){
            System.out.println(element+"-*-");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Integer[]intArr={1,2,3,4,5};
        String[]strArr={"A","B","C"};

        printArray(intArr);
        printArray(strArr);
    }
}
