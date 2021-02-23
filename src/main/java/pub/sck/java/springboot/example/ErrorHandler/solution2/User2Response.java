package pub.sck.java.springboot.example.ErrorHandler.solution2;

public class User2Response {
    private String name;
    private int age;

    public User2Response(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
