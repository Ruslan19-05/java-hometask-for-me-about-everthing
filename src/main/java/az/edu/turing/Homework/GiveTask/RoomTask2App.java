package az.edu.turing.Homework.GiveTask;

import java.util.Random;

public class RoomTask2App {

    public static void main(String[]args){

        Random random=new Random();
        String[] sutdents = {"Ruslan", "Faxri", "Ravan.A", "02-25", "07-49", "~Aydan",
                "02-67", "Dilber", "ElI", "Famil", "Guler", "Ibi$", "Lala",
                "Mammadova-4165", "Nicat", "Nihat", "Umar Numogemedov",
                "Revan.E", "Seyran", "Senubar", "Tural", "Yetar", "Э.Приева", "~R"};
        int[] chair=new int[24];
        for(int i=0;i<chair.length;i++){
            chair[i]=i+1;
        }
        for(int i=0;i<chair.length;i++) {
            int j=random.nextInt(24);
            int temp=chair[i];
            chair[i]=chair[j];
            chair[j]=temp;
        }
        for(int i=0;i<chair.length;i++){
            System.out.println(sutdents[i]+"--"+chair[i]);
        }
    }
}
