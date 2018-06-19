package pl.cschool.taskset4.doctor;

public class Doctor {

    private String name;
    private int id;
    private Workplace workplace;

    public Doctor(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Doctor() {
        System.out.println("Tworzę obiekt Doctor");
    }

    public void treat() {
        System.out.print("Leczy... ");
    }

    public Workplace getWorkplace() {
        return workplace;
    }

    public void setWorkplace(Workplace workplace) {
        this.workplace = workplace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
