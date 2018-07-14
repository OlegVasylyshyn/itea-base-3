package week5.day2.registration.old;

public class Service {

    private Repository repository = new Repository();

    public int registration(String login, String email, String pass) {
        // check email
        int random = (int) (Math.round(Math.random()));

        if(random == 0) {
            return repository.saveUser(login, email, pass);
        }
        return 2;
    }
}
