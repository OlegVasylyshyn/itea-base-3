package week3.day1;

public class User {

    String name = "user";
    private int age;

    public User() {
    }

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void whoAmI(){
        System.out.println("USER");
    }

    public String toString() {
        return "User. Name - " + getName() + ", age - " + getAge();
    }


    static int n = 0;
    public static void m() {
        n++;
        System.out.println("user");
    }

}
