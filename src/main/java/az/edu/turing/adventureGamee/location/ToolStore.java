package az.edu.turing.adventureGamee.location;

import az.edu.turing.adventureGamee.inventory.Inventory;
import az.edu.turing.adventureGamee.inventory.Weapon;
import az.edu.turing.adventureGamee.player.Player;

import static az.edu.turing.adventureGamee.util.InputUtil.getInteger;

public class ToolStore extends Location {

    public ToolStore(Player player) {
        super(player, "ToolStore");
    }

    @Override
    public boolean onLocation() {
        System.out.printf("You are at %s", getName() + ",You can buy weapon or armor!");
        Integer choose = getInteger("\n1.Weapon" + "\n2.Armor" + "\n3.Back to menu");

        switch (choose) {
            case 1:
                selectWeapon();
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return true;
    }

    public void selectWeapon(){
        System.out.printf("Your balance:" + this.getPlayer().getMoney());

        for(Weapon weapon: Inventory.weapons()){
            System.out.println(weapon);
        }

        Integer selectId=getInteger("Enter the weapon Id:");

        Weapon selectedWeapon=Inventory.byId(selectId);
        if(this.getPlayer().getMoney()>=selectedWeapon.getPrice()){
            System.out.println("Your old weapon:"+getPlayer().getWeapon());
            this.getPlayer().setWeapon(selectedWeapon);
            System.out.println("Your new weapon "+this.getPlayer().getWeapon());
            this.getPlayer().setMoney(this.getPlayer().getMoney()-selectedWeapon.getPrice());
        }else{
            System.out.println("You have not enough money!");
        }
    }
}
