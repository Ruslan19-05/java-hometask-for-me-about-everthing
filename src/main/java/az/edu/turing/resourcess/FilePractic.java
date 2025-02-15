package az.edu.turing.resourcess;

import java.io.*;

public class FilePractic {

    public static void main(String[] args) {

        try {
            //File creating
            File file01 = new File("C:\\Users\\LEGION\\OneDrive\\Masaüstü\\github\\java-backend-hometask05-2\\resourcess\\file2.txt");
            if (file01.createNewFile()) {
                System.out.println("File is create successfully!" + file01.getName());
            } else {
                System.out.println("File is has already!");
            }

            //FileWriter
            FileWriter fileWriter01 = new FileWriter(file01);
            BufferedWriter bufferedWriter01 = new BufferedWriter(fileWriter01);
            bufferedWriter01.write("Hello,World!");
            bufferedWriter01.newLine();
            bufferedWriter01.write("This is JAVA IO example:)");
            bufferedWriter01.close();

            System.out.println("Information write on file!");

            //FileReader
            FileReader fileReader01 = new FileReader(file01);
            BufferedReader bufferedReader01 = new BufferedReader(fileReader01);
            String line;
            while ((line = bufferedReader01.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader01.close();

            //FileOutPutStream
            FileOutputStream fileOutputStream01=new FileOutputStream(file01,true);
            String data="\nMy name is Ruslan:()";
            fileOutputStream01.write(data.getBytes());
            fileOutputStream01.close();
            System.out.println("Byte information was written!");

            //FileInPutStream
//            FileInputStream fileInputStream01=new FileInputStream(file01);
//            int bayt;
//            while ((bayt=fileInputStream01.read())!=-1){
//                System.out.println((char) bayt);
//            }
//            fileInputStream01.close();

        } catch (IOException e) {
            System.out.println("Error!" + e.getMessage());
        }

    }
}
