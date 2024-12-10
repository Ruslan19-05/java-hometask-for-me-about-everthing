package az.edu.turing.OppSimpleProject.SimplePojects2;

public class ElectronicProduct extends Product {

    private String warrantyPeriod;

    public ElectronicProduct(String name,double price,int quantity,String warrantyPeriod){
        super(name,price,quantity);
        this.warrantyPeriod=warrantyPeriod;
    }

    public String getWarrantyPeriod(){
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod){
        this.warrantyPeriod=warrantyPeriod;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("WarrantyPeriond:"+warrantyPeriod);
    }
}
