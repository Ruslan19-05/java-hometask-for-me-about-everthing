package az.edu.turing.OppSimpleProject;

import java.util.ArrayList;

public class Library {

    private ArrayList<İtem> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    public void addItem(İtem i̇tem) {

        items.add(i̇tem);
    }

    public void searchItem(String title){
        for(İtem item:items){
            if(item.getTitle().equalsIgnoreCase(title)){
                item.displayInfo();
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void borrowItem(int id){
        for(İtem item:items){
            if(item.getId()==id){
                item.borrowItem();
                return;
            }
        }
        System.out.println("Item with id "+id+" not found.");
    }

    public void displayAllItems(){
        for(İtem i̇tem:items){
            i̇tem.displayInfo();
            System.out.println();
        }
    }
}
