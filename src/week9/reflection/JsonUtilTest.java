package week9.reflection;


public class JsonUtilTest {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        User user = new User("Dex", "Jason", 30);
        String json = JsonUtil.toJson(user);
        System.out.println(json);
        System.out.println(JsonUtil.toJson(new Student("James", "wer", 45, 5, "Teacher", "2")));

        User parsedUser = JsonUtil.fromJson(json, User.class);
        System.out.println("After parse : " + parsedUser);

    }

    static class Student {

        private String firstName;
        private String lastName;
        private int age;
        private int mark;
        private String teacher;
        private String grade;

        public Student(String firstName, String lastName, int age, int mark, String teacher, String grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.mark = mark;
            this.teacher = teacher;
            this.grade = grade;
        }
    }

}
