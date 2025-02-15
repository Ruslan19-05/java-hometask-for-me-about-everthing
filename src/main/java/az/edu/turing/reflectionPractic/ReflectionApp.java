package az.edu.turing.reflectionPractic;

import java.io.*;
import java.lang.reflect.Field;
import java.util.Arrays;

public class ReflectionApp {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {

        Student01 student01=new Student01("Ruslan",2255);
        Class<?> studentClass01= Student01.class;

        Field[] fields01=studentClass01.getDeclaredFields();
        for(Field field:fields01){
            field.setAccessible(true);
            System.out.println("Name:"+field.getName());
            System.out.println("Type:"+field.getType());
            System.out.println(field.getType().getSimpleName());
            System.out.println(field.getType().getPackage());
            System.out.println(field.getType().getSuperclass());
            System.out.println(Arrays.toString(field.getType().getInterfaces()));
            System.out.println("---------------------------------");
        }

        System.out.println(fields01[0].get(null));
        System.out.println(fields01[1].get(student01));
        Field nameFields01=studentClass01.getDeclaredField("name");
        nameFields01.setAccessible(true);
        nameFields01.set(student01,"Cherkezov");

        String path = "C:\\Users\\LEGION\\OneDrive\\Masaüstü\\github\\java-backend-hometask05-2\\resourcess\\file33.txt";
        File file=new File(path);
        boolean exists=!file.exists();
        boolean empty=file.exists() && file.length()!=0;




        try(FileOutputStream fileOut=new FileOutputStream(path,true)){
            ObjectOutputStream out=(exists|| empty)? new AppendOutputStream(fileOut):new ObjectOutputStream(fileOut);

            out.writeObject("Hello,Maykl Jekson:)");
            out.close();
        }catch (IOException e){
            System.out.println("Error! "+e.getMessage());
        }
        System.out.println("--------------------------------");

        try(ObjectOutputStream outputStream01=new ObjectOutputStream(new FileOutputStream("ruslan.serial"))){
            outputStream01.writeObject(student01);

        }catch (IOException e){
            System.out.println("Error:"+e.getMessage());
        }
    }
}
