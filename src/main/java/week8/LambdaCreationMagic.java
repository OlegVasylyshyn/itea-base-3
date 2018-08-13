package week8;

import java.util.function.Function;

public class LambdaCreationMagic {

    private static LambdaCreationMagic INSTANCE = new LambdaCreationMagic();

    public static void main(String[] args) {

        // Lambda creation without cycle from static method
        System.out.println((Runnable)LambdaCreationMagic::f);
        System.out.println((Runnable)LambdaCreationMagic::f);
        System.out.println((Runnable)LambdaCreationMagic::f);
        System.out.println();

        // Lambda creation without cycle from non-static method
        System.out.println((Runnable)INSTANCE::f2);
        System.out.println((Runnable)INSTANCE::f2);
        System.out.println((Runnable)INSTANCE::f2);
        System.out.println();

        // Lambda creation in cycle from non-static method
        for (int i = 0; i < 3; i++) System.out.println((Runnable)INSTANCE::f2);
        System.out.println();

        // Lambda creation in cycle from static method
        for (int i = 0; i < 3; i++) System.out.println((Runnable)LambdaCreationMagic::f);

        for (int i = 0; i < 3; i++) System.out.println(Function.identity());
    }

    private static void f(){}

    private void f2(){}

}
