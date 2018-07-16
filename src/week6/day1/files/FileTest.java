package week6.day1.files;

import java.io.File;

public class FileTest {

    public static void main(String[] args) {

        File file = new File("copied.jpg");
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println("File size - " + file.length());


        File dir = new File(".");
        for(File f : dir.listFiles()) {
            System.out.println(f.getName());
        }

        File parent = dir.getAbsoluteFile();
        System.out.println("Parent dir - " + parent);


    }

}
