package az.edu.turing.OOP;

public class GameApp {

    public static void main(String[] args) {

        Game pubg=new Game("Efootball","War",2,120,12,"Mobile");

        pubg.setName("Ruslan");
        pubg.setAbout("Bottle");
        pubg.setSize(5);
        pubg.setFps(240);
        pubg.setAgeLimit(18);
        pubg.setFor("PC");
        System.out.println(pubg.getName());
        System.out.println(pubg.getAbout());
        System.out.println(pubg.getSize());
        System.out.println(pubg.getFps());
        System.out.println(pubg.getAgeLimit());
        System.out.println(pubg.getFor());
    }
}
