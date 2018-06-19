package pl.cschool.taskset4.doctor;

public class FamilyDoctor extends Doctor {

    private boolean hasDomiciliaryVisits;

    public FamilyDoctor(String name, int id) {
        super(name, id);
        hasDomiciliaryVisits=false;
    }

    public FamilyDoctor() {
        System.out.println("Tworzę obiekt klasy FamilyDoctor");
    }

    public void setHasDomiciliaryVisits(boolean hasDomiciliaryVisits) {
        this.hasDomiciliaryVisits = hasDomiciliaryVisits;
    }

}
