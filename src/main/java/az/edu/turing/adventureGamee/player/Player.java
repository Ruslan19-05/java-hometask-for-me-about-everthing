package az.edu.turing.adventureGamee.player;

import static az.edu.turing.adventureGamee.util.InputUtil.getInteger;

public class Player {

    private Integer id;
    private String name;
    private Integer damage;
    private Integer health;
    private Integer money;

    public Player(Integer id, String name, Integer damage, Integer health, Integer money) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.money = money;
    }

    public Player() {
    }

    public void selectorChar() {

        Samurai samurai = new Samurai();
        Knight knight = new Knight();
        Archer archer = new Archer();
        System.out.println(samurai);
        System.out.println(archer);
        System.out.println(knight);
        System.out.println("-----------------------------------------------------------------------");

        Integer playerId = getInteger("Enter the player Id");

        while (!(playerId == 1 || playerId == 2 || playerId == 3)) {
            playerId=getInteger("Invalid input ,Enter the value between 1 and 3");
        }
        switch (playerId) {

            case 1:
                System.out.println(samurai);
                break;
            case 2:
                System.out.println(archer);
                break;
            case 3:
                System.out.println(knight);
                break;
            default:
                System.out.println("Invalid input!");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }


    @Override
    public String toString() {
        return "ID=" + id + ", name='" + name + ", damage=" + damage + ", health=" + health + ", money=" + money;
    }
}
