package week7.linkedlist;

public class MyLinkedListTest {

    public static void main(String[] args) {

        MyLinkedList<Integer> list =  new MyLinkedList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

    }

}

class A {

    private String firstName;
    private String lastName;

    public A() {
        this("default");
    }
    public A(String firstName) {
        this(firstName, "default");
    }
    public A(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
