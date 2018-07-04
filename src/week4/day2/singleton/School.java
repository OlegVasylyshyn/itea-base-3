package week4.day2.singleton;

final public class School {

    private static School INSTANCE;

    private School(){}

    public static School getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new School();
        }
        return INSTANCE;
    }

}
