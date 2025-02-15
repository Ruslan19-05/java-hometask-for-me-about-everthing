package az.edu.turing.resourcess;

import java.io.*;

public class FileManeger {

    public static void main(String[] args) throws IOException {

        String path="\"C:\\\\Users\\\\LEGION\\\\OneDrive\\\\Masaüstü\\\\github\\\\java-backend-hometask05-2\\\\resourcess\\\\file33.txt\"";
        File file=new File(path);
        boolean exists=!file.exists();
        boolean empty=!file.exists()&& file.length()==0;




        try(FileOutputStream fileOut=new FileOutputStream(path,true)){
            ObjectOutputStream out=(exists|| empty)? new AppendObjectOutputStream(fileOut):new ObjectOutputStream(fileOut)
        }//catch (IOException | ClassNotFoundException e){
            System.out.println("Error! "+e.getMessage());
        }


    }
}
