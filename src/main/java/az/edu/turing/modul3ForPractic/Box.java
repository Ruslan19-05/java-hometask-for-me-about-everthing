package az.edu.turing.modul3ForPractic;

public class Box<T> {

    private T value;

    public void setValue(T value){
        this.value=value;
    }

    public T getValue(){
        return value;
    }
}
