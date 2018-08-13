package week6.day1.files;

import java.util.Arrays;

public class TestTextFiles {

    public static void main(String[] args) {

        String s = "Hello world\nNext line";
        IOUtil.createTextFile(s, "text.txt");
        IOUtil.createTextFileNew(Arrays.asList("Hello world", "Next line", "Last line"), "newText.txt");

        System.out.println(IOUtil.readTextFileByScanner("text.txt"));
        System.out.println(IOUtil.readTextFileByBufferedReader("newText.txt"));



    }

}
