package week3.day1;

public class BusinessUser extends User {

    private String creditCard;
    String name = "business user";


    public BusinessUser() {
    }

    public BusinessUser(String name, int age, String creditCard) {
        super(name, age);
        this.creditCard = creditCard;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public void whoAmI(){
        System.out.println("BUSINESS USER");
    }

    public void whoAmI(String str){
        System.out.println("BUSINESS USER");
    }

    public void f() {

    }

    public String toString() {
        return "Business user. " + super.toString() + ", credit card - " + creditCard;
    }

    public static void m(){
        System.out.println("business");
    }

}
