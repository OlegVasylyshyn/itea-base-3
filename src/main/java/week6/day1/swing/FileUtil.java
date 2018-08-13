package week6.day1.swing;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileUtil {

    public static String readTextFile(File file) {

        try (Scanner sc = new Scanner(file);){

            StringBuilder sb = new StringBuilder();
            while (sc.hasNextLine()) {
                sb.append(sc.nextLine()).append('\n');
            }

            return sb.toString();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

}
