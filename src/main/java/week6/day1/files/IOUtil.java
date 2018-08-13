package week6.day1.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class IOUtil {

    private IOUtil(){}


    public static void serialize(User user, String fileName) {

        try(
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
        ) {
            oos.writeObject(user);
            System.out.println("Was successfully created file - " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static User deserialize(String fileName) {

        try(
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
        ) {
            return (User) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }

    }

    public static void createTextFile(String text, String fileName) {

        try(PrintWriter writer = new PrintWriter(fileName)) {
            writer.write(text);
            System.out.println("Was successfully created file - " + fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void createTextFileNew(Iterable<String> text, String fileName) {

        Path path = Paths.get(fileName);
        try {
            Files.write(path, text);
            System.out.println("Was successfully created file - " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String readTextFileByScanner(String fileName) {

        try(Scanner scanner = new Scanner(new FileInputStream(fileName))){

            StringBuilder sb = new StringBuilder();
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine()).append('\n');
            }
            return sb.toString();

        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }

    }

    public static String readTextFileByBufferedReader(String fileName) {

        try(
                BufferedReader reader = new BufferedReader(new FileReader(fileName))
        ) {

            StringBuilder sb = new StringBuilder();
            while (reader.ready()) {
                sb.append(reader.readLine()).append('\n');
            }
            return sb.toString();

        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }

    }

    public static void copyFile(String sourceFile, String targetFile) {

        try (
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(targetFile);
        ) {
            byte[] buff = new byte[1028];
            int read = 0;
            while ((read = fis.read(buff, 0, buff.length)) != -1) {
                fos.write(buff, 0, read);
            }
            fos.flush();
            System.out.println("Was successfully copied file - " + sourceFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
