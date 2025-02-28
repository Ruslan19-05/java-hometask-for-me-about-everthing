package az.edu.turing.quiz9_10;

public class BoxApp {

    public static void main(String[] args) {

        Box<Integer> box1=new Box<>(5);
        Box <Double>box2=new Box<>(5.3);
        System.out.println(box1.getData()+box2.getData());
    }
}
