package az.edu.turing.adventureGamee.game;

import az.edu.turing.adventureGamee.location.*;
import az.edu.turing.adventureGamee.player.Player;
import az.edu.turing.adventureGamee.util.InputUtil;

import java.util.Scanner;

import static az.edu.turing.adventureGamee.util.InputUtil.getInteger;

public class Game {

    public static void start() {
        System.out.println("\t\t\t----------------------Welcome Adventure Game----------------");

        Scanner scanner = new Scanner(System.in);
        String name1 = InputUtil.getText("Enter the name ");
        System.out.printf("Hello %s ,Everything is real you see here\n ", name1);

        Player player = new Player();
        player.selectorChar();
        Location location = null;
        boolean flag = true;
        while (flag) {
            int menu = getInteger("##############Locations##########" + "\n1.SafeHouse" + "\n2.ToolStore" + "\n3.Cave" + "\n4.Forest" + "\n5.River" + "\n6.Exit");

            switch (menu) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Forest(player);
                    break;
                case 4:
                    location = new River(player);
                    break;
                case 5:
                    location = new Cave(player);
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid number!");
            }
        }
    }
}
