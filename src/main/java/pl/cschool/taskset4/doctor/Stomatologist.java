package pl.cschool.taskset4.doctor;

public class Stomatologist extends Doctor {

    public Stomatologist(String name, int id) {
        super(name, id);
    }

    public Stomatologist() {
        System.out.println("Tworzę obiekt Stomatologist");
    }

    @Override
    public void treat() {
        super.treat();
        System.out.print(" zęby");
    }
}
