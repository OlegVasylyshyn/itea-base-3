package week5.day2.registration.exception;

public class Service {

    private Repository repository = new Repository();

    public void registration(String login, String email, String pass) throws RegistrationException, DatabaseException {
        // check email
        int random = (int) (Math.round(Math.random()));

        if(random == 1) {
            throw new RegistrationException("Email was not unique");
        }
        repository.saveUser(login, email, pass);
    }
}
