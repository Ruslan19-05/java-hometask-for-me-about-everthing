package az.edu.turing.quiz9_10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {

        public static void readFile(String filePath) {

            try {
                File file = new File(filePath);
                Scanner scanner = new Scanner(file);
            } catch ( FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }


