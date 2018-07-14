package week5.day2.registration.exception;

public class Repository {

    private static int count = 0;

    public void saveUser(String login, String email, String pass) throws DatabaseException {
        count++;
        int random = (int) (Math.round(Math.random()));
        if(random == 1) {
            throw new DatabaseException("Database was not available", count);
        }
        // persisted
    }
}
