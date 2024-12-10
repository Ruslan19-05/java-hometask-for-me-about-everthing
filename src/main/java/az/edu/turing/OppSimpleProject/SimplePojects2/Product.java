package az.edu.turing.OppSimpleProject.SimplePojects2;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String name,double price,int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    public void displayInfo(){
        System.out.println("Name:"+name+"\n"+"Price:"+price+"\n"+"Quantity:"+quantity);
    }

    public void sell(int count){
        if(quantity>=count){
            quantity-=count;
            System.out.println(count+" "+name+" sold.");
        }else{
            System.out.println("We don't have "+name+" enough product.");
        }
    }

    public void restock(int count){
        quantity+=count;
        System.out.println(count+" "+name+" restocked");
    }
}
