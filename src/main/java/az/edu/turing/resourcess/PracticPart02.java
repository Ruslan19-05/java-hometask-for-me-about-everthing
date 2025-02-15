package az.edu.turing.resourcess;

import java.io.*;

public class PracticPart02 {

    public static void main(String[] args) {


        try {
            File file02=new File("C:\\Users\\LEGION\\OneDrive\\Masaüstü\\github\\java-backend-hometask05-2\\resourcess\\rslnNsrn.txt");
            if(file02.createNewFile()){
                System.out.println("file yaradildir"+file02.getName());
            }else{
                System.out.println("File Movcuddur"+file02.getName());
            }

            FileWriter fileWriter02=new FileWriter(file02);
            BufferedWriter bufferedWriter02=new BufferedWriter(fileWriter02);
            bufferedWriter02.write("Hello,Ruslan");
            bufferedWriter02.newLine();
            bufferedWriter02.write("How are You?");
            bufferedWriter02.close();
            System.out.println("File yazildi!");

            FileReader fileReader02=new FileReader(file02);
            BufferedReader bufferedReader02=new BufferedReader(fileReader02);
            String line;
            String longestLine="";
            int maxLength=0;
            int n=0;
                while((line=bufferedReader02.readLine())!=null){
                    System.out.println(line);
                    n++;
                    if(line.length()>maxLength){
                        maxLength=line.length();
                        longestLine=line;
                    }
                }
            System.out.println(longestLine);
            System.out.println(n);
                    bufferedReader02.close();



        }catch (IOException e){
            System.out.println("Error!"+e.getMessage());
        }
//
//        String sourceFile="file02.txt";
//        String destinationFile="rslnNsrn.txt";
//
//        try(FileReader fileReader03=new FileReader(sourceFile);
//            BufferedReader bufferedReader03=new BufferedReader(fileReader03);
//            FileWriter fileWriter03=new FileWriter(destinationFile);
//            BufferedWriter bufferedWriter03=new BufferedWriter(fileWriter03)) {
//
//            String line;
//            while((line=bufferedReader03.readLine())!=null){
//                bufferedWriter03.write(line);
//                bufferedWriter03.newLine();
//            }
//
//        }catch (IOException e){
//            System.out.println("error! "+e.getMessage());
//        }
    }
}
