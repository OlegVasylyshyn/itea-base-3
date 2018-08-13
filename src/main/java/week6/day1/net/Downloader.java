package week6.day1.net;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Downloader {

    public static void main(String[] args) throws IOException {

        // TCP/IP iPv-4 - 128.0.0.1:80
        // UDP

        URL url = new URL("https://github.com/");
        URLConnection urlConnection = url.openConnection();
        InputStream is = urlConnection.getInputStream();
        Scanner scanner = new Scanner(is);

        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextLine()) {
            sb.append(scanner.nextLine()).append('\n');
        }

//        System.out.println(sb);

        Pattern pattern = Pattern.compile("(http|https|ftp)://\\S*?\\.(png|jpg)");
        Matcher matcher = pattern.matcher(sb.toString());

        while (matcher.find()) {
            System.out.print("Start index: " + matcher.start());
            System.out.print(" End index: " + matcher.end() + " ");
            System.out.println(matcher.group());
        }

        url = new URL("https://github.com/fluidicon.png");
        urlConnection = url.openConnection();
        try(
                InputStream fis1 = urlConnection.getInputStream();
                FileOutputStream fos = new FileOutputStream("downloaded.png")) {

            byte[] buff = new byte[1028];
            int read = 0;
            while ((read = fis1.read(buff, 0, buff.length)) != -1) {
                fos.write(buff, 0, read);
            }
            System.out.println("File was successfully created!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
