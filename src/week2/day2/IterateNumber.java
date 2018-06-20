package week2.day2;

public class IterateNumber {

    public static void main(String[] args) {

        int i = 10;

        iterate(i);

    }

    private static void iterate(int i) {

        if(i < 0){
            return;
        }

//        System.out.println(i--);
//        iterate(i--);

        iterate(--i);
        System.out.println(i);

    }

}
