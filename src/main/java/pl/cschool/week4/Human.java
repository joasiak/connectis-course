package pl.cschool.week4;

public class Human extends Animal {

    private String name;
    private HouseCat myCat = new HouseCat();

    public Human() {
        System.out.println("Tworzę obiekt Human");
    }

    public Human(String name, HouseCat myCat) {
        this.name = name;
        this.myCat = myCat;
        System.out.println("Tworzę obiekt Human konstruktor z parametrem");
    }

    public Human(HouseCat myCat) {
        this.myCat = myCat;
        System.out.println("Tworzę obiekt Human konstruktor z parametrem");
    }

    public HouseCat getMyCat() {
        return myCat;
    }

    public void setMyCat(HouseCat myCat) {
        this.myCat = myCat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
