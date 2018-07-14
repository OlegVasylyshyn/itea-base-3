package week5.day2.registration.exception;


public class Run {

    public static void main(String[] args) {

        // Construction try-catch-finally | try-finally | try-catch

        Controller controller = new Controller();

        boolean isSuccess = false;
        while (!isSuccess)
        try {

            controller.registration("login", "email", "pass");
            isSuccess = true;

            // won't be done if some exception

        } catch (RegistrationException e) {

            // won't be done if wasn't some exception

            System.err.println("Something went wrong. Message - " + e.getMessage());
            System.out.println("Please try again.");
//            e.printStackTrace();
        } catch (DatabaseException e) {
            System.out.println("Something went wrong with database. Message - " + e.getMessage());
            System.out.println("How many times database was not available - " + e.getCount());
        } catch (NullPointerException | NumberFormatException e) {
            e.printStackTrace();
        } catch (Throwable t) {
            t.printStackTrace();
        } finally {
            System.out.println("ALWAYS");
        }

        System.out.println("IT WON'T BE ALWAYS");


        try {

        } finally {

        }

        System.out.println("User was successfully created.");

    }

}
