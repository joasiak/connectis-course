package pl.cschool.week4;

public class Employee extends Human {

    private long Id;
    private static long no=0;

    public Employee(String name, HouseCat myCat) {
        super(name, myCat);
        Id = no++;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", name='" + getName() + '\'' +
                '}';
    }
}
