package az.edu.turing.Generics;

import java.util.ArrayList;
import java.util.List;

public class DataManager <T extends   Comparable<T>> {

    private List<T> dataList=new ArrayList<>();

    public void addData(T data){
        dataList.add(data);
    }

    public T getData(int index){
        if(index >=0 && index<dataList.size()){
            return dataList.get(index);
        }
        throw new IndexOutOfBoundsException("Index Movcud deyil!");
    }

    public void printAllData(){
        for(T data:dataList){
            System.out.println(data);
        }
    }
}
