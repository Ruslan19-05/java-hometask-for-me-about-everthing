package az.edu.turing.adventureGamee.inventory;

public class Weapon {

    private Integer ID;
    private String  name;
    private Integer damage;
    private Integer price;

    public Weapon(Integer ID, String name, Integer damage, Integer price) {
        this.ID = ID;
        this.name = name;
        this.damage = damage;
        this.price = price;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Weapon:" +
                "ID=" + ID +
                ", name='" + name  +
                ", damage=" + damage +
                ", price=" + price;
    }
}
