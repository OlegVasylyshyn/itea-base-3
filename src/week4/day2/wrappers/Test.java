package week4.day2.wrappers;

public class Test {

    // Inboxing
    Boolean b = false;

    // Null expected
    Integer i;

    public static void main(String[] args) throws InterruptedException {

        Integer i = 10;
        Long l = 10L;
        Character c = ' ';

        System.out.println(new Test().b);
        System.out.println(new Test().i);

        // Outboxing/Unboxing
        // May be caught NullpointerException
        int primitive = i;


        Integer nullInteger = null;
//        int number = increment(nullInteger);

//        Thread.sleep(5000);

        int intValue = Integer.parseInt("10");
        System.out.println(intValue);
        Integer anotherInteger = Integer.valueOf("10");
        System.out.println(anotherInteger == i);


        // 50 - 100
        System.out.println(genNumber(50, 100));

    }

    public static int increment(int number) {
        return number++;
    }

    public static int genNumber(int min, int max) {
        return (int) (min + Math.random() * (max - min));
    }

}
