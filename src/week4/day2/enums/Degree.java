package week4.day2.enums;

import java.util.Optional;

public enum Degree {

    MASTER("some login", "some pass"),
    PROFESSOR,
    DEFAULT;

    private String login;
    private String pass;

    Degree(){
        System.out.println("1");
    }

    Degree(String login, String pass){
        System.out.println("2");
        this.login = login;
        this.pass = pass;
    }


    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public static Degree getDegree(String degree) {
        for(Degree d : Degree.values()) {
            if(d.name().equals(degree)) {
                return d;
            }
        }
        return DEFAULT;
    }

//    public static Optional<Degree> getDegree(String degree) {
//        for(Degree d : Degree.values()) {
//            if(d.name().equals(degree)) {
//                return Optional.of(d);
//            }
//        }
//        return Optional.empty();
//    }

}
