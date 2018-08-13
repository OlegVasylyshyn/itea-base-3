package week5.day2.registration.exception;

public class Controller {

    private Service service = new Service();

    public void registration(String login, String email, String pass) throws RegistrationException, DatabaseException {
        service.registration(login, email, pass);
    }
}
