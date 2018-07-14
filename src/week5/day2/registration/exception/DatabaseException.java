package week5.day2.registration.exception;

public class DatabaseException extends Exception {

    private int count;

    public DatabaseException(String message, int count) {
        super(message);
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
