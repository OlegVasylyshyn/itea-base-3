package week4.day2.enums;

public class Test {

    public static void main(String[] args) {

        Degree professor = Degree.PROFESSOR;
        System.out.println(Degree.MASTER == Degree.MASTER);

        Degree degree = Degree.MASTER;
        Degree degree2 = Degree.MASTER;
        Degree degree3 = Degree.MASTER;

        switch (degree) {

            case MASTER: {
                System.out.println("Master");
                break;
            }
            case PROFESSOR: {
                System.out.println("Professor");
                break;
            }

        }

        System.out.println(degree.getLogin());

        System.out.println(professor);


        if(professor == Degree.PROFESSOR) {
            System.out.println("Equal");
        }

        if(professor instanceof Enum) {
            System.out.println("professor is instance of Enum");
        }

        Object someString = "";
        if(someString instanceof Enum) {
            System.out.println("string is instance of Enum");
        } else {
            System.out.println("string isn't instance of Enum");
        }

        String enumString = "PROFESSOR";
        Degree professor2 = Enum.valueOf(Degree.class, enumString);
        System.out.println(professor2);


        System.out.println();
        System.out.println("All enums : ");
        for(Degree d : Degree.values()) {
            System.out.println(d);
        }

        System.out.println();
        System.out.println(Degree.getDegree("PROFESSOR"));
        System.out.println(Degree.getDegree("PROFESSOR2"));


//        Degree fromOptional = Degree.getDegree("MASTER").orElse(Degree.DEFAULT);
//        System.out.println(fromOptional);

    }



}
