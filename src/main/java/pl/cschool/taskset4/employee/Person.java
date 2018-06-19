package pl.cschool.taskset4.employee;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
        System.out.println("Tworzę obiekt klasy Person");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
