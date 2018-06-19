package pl.cschool.taskset4.doctor;

public class Surgeon extends Doctor {

    public Surgeon(String name, int id) {
        super(name, id);
        super.setWorkplace(Workplace.SZPITAL);
    }

    public Surgeon() {
        System.out.println("Tworzę obiekt Surgeon");
    }

    @Override
    public void treat() {
        System.out.print("Przeprowadza operacje...");
    }

    public void surgery() {
        System.out.println("Zrób nacięcie");
    }
}
