package az.edu.turing.resourcess;

import java.lang.reflect.Field;

public class ClassMain {

    public static void main(String[] args) throws IllegalAccessException {

        Student student1=new Student("Rus",19);

        Class<?> studentClass=Student.class;

        Field[] fields=studentClass.getDeclaredFields();
        for(Field field:fields){
            field.setAccessible(true);
            System.out.println("Name:"+field.getName());
            System.out.println("Type"+field.getType());
        }

        System.out.println(fields[0].get(null));
        System.out.println(fields[1].get(student1));
    }
}
