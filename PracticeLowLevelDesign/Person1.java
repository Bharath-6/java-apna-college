package PracticeLowLevelDesign;

class Person {
    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}

public class Person1 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Bharath");
        p.setAge(22);
        p.setGender("Male");
        System.out.println("Name " + p.getName());
        System.out.println("Age " + p.getAge());
        System.out.println("Name " + p.getGender());

    }
}