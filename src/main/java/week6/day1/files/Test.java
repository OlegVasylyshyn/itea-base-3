package week6.day1.files;

import java.io.IOException;

public class Test {

    public static final String FILE_NAME = "user.user";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User dex = new User("Dex", 23);
        IOUtil.serialize(dex, FILE_NAME);

        User user = IOUtil.deserialize(FILE_NAME);
        System.out.println(user);

    }


}
