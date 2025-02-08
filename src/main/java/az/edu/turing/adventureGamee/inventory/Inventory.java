package az.edu.turing.adventureGamee.inventory;

public class Inventory {

    public static Weapon[] weapons() {

        Weapon[] weapons = new Weapon[3];
        weapons[0] = new Weapon(1, "Pistol", 4, 25);
        weapons[1] = new Weapon(2, "AK-47", 5, 25);
        weapons[2] = new Weapon(3, "Sniper", 5, 30);
        return weapons;
    }

    public static Weapon byId(int id) {

        Weapon weapon = null;
        for(Weapon w:weapons()){
            if(w.getID().equals(id)){
                weapon=w;
            }
        }
        return weapon;
    }
}
