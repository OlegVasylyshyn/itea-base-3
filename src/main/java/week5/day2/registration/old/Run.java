package week5.day2.registration.old;

public class Run {

    public static void main(String[] args) {

        Controller controller = new Controller();
        int registration = controller.registration("login", "email", "pass");

        if(registration == 0) {
            System.out.println("Successfully was persisted");
        } else if(registration == 1) {
            System.out.println("Database was not available");
        } else {
            System.out.println("Email was not unique");
        }

    }

}
