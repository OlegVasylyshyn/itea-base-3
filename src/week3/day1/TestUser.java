package week3.day1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestUser {

    public static void main(String[] args) {

        User user = new User("DEX", 20);
        System.out.println(user);

        System.out.println();
        BusinessUser businessUser = new BusinessUser("JASON", 33, "2342 2342 23424 2342");
        System.out.println(businessUser);

        System.out.println();
        user.whoAmI();
        businessUser.whoAmI();

        // Abstraction
        user = businessUser;
        businessUser = (BusinessUser) user;

        System.out.println(businessUser);


        BusinessUser bu = new BusinessUser();
        bu.m();

        System.out.println(User.n);

    }

    // abstraction
    private boolean m(List<String> l) {
        // polymorphism
        l.add("DEX");
        return false;
    }

}
