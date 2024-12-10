package az.edu.turing.OppSimpleProject.SimplePojects2;

public class FoodProduct extends Product{

    private String expirationDate;

    public FoodProduct(String name,double price,int quantity,String expirationDate){
        super(name,price,quantity);
        this.expirationDate=expirationDate;
    }

    public String getExpirationDate(){
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate){
        this.expirationDate=expirationDate;
    }

    @Override
    public void displayInfo(){
       super.displayInfo();
        System.out.println("ExpirationDate:"+expirationDate);

    }
}
