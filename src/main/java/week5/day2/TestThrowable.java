package week5.day2;

public class TestThrowable {

    public static void main(String[] args) throws Throwable {
        UncheckedException myExc = new UncheckedException();
        if(true)
        throw myExc;

        Throwable throwable = new Throwable("Error");
        System.out.println(throwable);

        if(true)
        throw throwable;

        System.out.println();
    }

    static class UncheckedException extends RuntimeException {

    }

}
