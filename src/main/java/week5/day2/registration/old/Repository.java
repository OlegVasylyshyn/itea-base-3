package week5.day2.registration.old;

public class Repository {


    public int saveUser(String login, String email, String pass) {
        int random = (int) (Math.round(Math.random()));
        if(random == 0) {
            return 0;
        }
        return 1;
    }

}
