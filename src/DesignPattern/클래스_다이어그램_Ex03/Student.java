package DesignPattern.클래스_다이어그램_Ex03;

public class Student {

    private String id = "20192162";
    private String name = "홍길동";

    public String toString() {
        return ("[" + getName() + "] " + "id = " + getId());
    }

    public static void main(String[] args) {
        Address address = new Address();
        Student student = new Student();
        String s = student.toString() + address.toString();
        System.out.println(s);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
