package week3.day2.java8;

public interface Java8Interface {

    public static int n = 10;

    void work();

    default void m(){
        System.out.println("Default method f");
    }

}
