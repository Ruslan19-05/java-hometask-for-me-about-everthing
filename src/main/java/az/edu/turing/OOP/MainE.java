package az.edu.turing.OOP;

public class MainE {

    public static void main(String[] args) {

        Employee manager=new Manager("Ruslan",7000,5);
        Employee devloper=new Developer("Ruslan2",5000,"JAVA");

        Employee [] arr1={manager,devloper};
            for(int i=0;i<arr1.length;i++){
                System.out.println(arr1[i]);
            }
    }
}
