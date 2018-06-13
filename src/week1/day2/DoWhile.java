package week1.day2;

public class DoWhile {

    public static void main(String[] args) {

        // do statement;
        // while(condition);

        int i = 0;
        do {

            if(i == 5) {
                break;
            }

            System.out.println(i);
        } while (++i < 10);

    }

}
