package az.edu.turing.Homework.GiveTask;

import java.util.Random;

public class RoommatesApp {

    public static void main(String[] args) {
        //qrupdakıların random oturacaqları yerlər
        //input
        Random random = new Random();
        String[] sutdents = {"Ruslan", "Faxri", "Ravan.A", "Yetər", "Gülər", "Sənubər",
                "Günay", "Dilber", "ElI", "Famil", "Rena", "Lala","Tural",
                "Ramina", "Nicat","Ömər","Pərvin","Seyran","Aynur","Mehemmed","Ella","Revan.E","Ibrahim"
                    };
        int[] chair = new int[24];
        //proses
        for (int i = 0; i < chair.length; i++) {//ededler üçün
            chair[i] = i + 1;
        }
        for (int i = chair.length - 1; i > 0; i--) {//ədələri qarışdırmaq üçün
            int j = random.nextInt(24);
            int temp = chair[i];
           chair[i] = chair[j];
            chair[j] = temp;
        }
        //output
        for (int i = 0; i < sutdents.length; i++) {//çap
            System.out.println(sutdents[i] + "--" + chair[i]);
        }
    }
}
