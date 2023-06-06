package example;

public class LiarBoy {
    private int age;
    private String name;

    public LiarBoy() {
    }

    public LiarBoy(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age + 10;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void lie() {
        System.out.println("鬼が来たぞ");
    }
}