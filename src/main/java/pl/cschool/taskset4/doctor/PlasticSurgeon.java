package pl.cschool.taskset4.doctor;

public class PlasticSurgeon extends Surgeon {

    public PlasticSurgeon() {
        System.out.println("Tworzę obiekt PlasticSurgeon");
    }

    @Override
    public void treat() {
        super.treat();
        System.out.println(" plastyczne");
    }
}
