package week5.day2.registration.old;

public class Controller {

    private Service service = new Service();

    public int registration(String login, String email, String pass) {
        return service.registration(login, email, pass);
    }
}
