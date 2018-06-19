package pl.cschool.week4;

public class HouseCat extends Cat {

    int sizeHouseCat;

    public HouseCat(int size, int sizeCat, int sizeHouseCat) {
        super(size, sizeCat);
        this.sizeHouseCat = sizeHouseCat;
        System.out.println("Tworzę obiekt kota domowego konstruktor z parametrami");
    }

    public HouseCat() {
        System.out.println("Tworzę obiekt kota domowego");
    }
}
