package az.edu.turing.Homework.Tasks120;


public class Hard7Appsorted {

    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4};
        int[] list2 = {1, 3, 4, 7};
        for (int i = 0; i < list2.length; i++) {
                if (list1[i] == list2[i]) {
                    System.out.print(  list1[i]+","+list2[i] + ",");
                }else if(list1[i]<list2[i]){
                    System.out.print(list1[i]+",");
                }else{
                    System.out.print(list2[i]+",");
                }
        }
    }
}
