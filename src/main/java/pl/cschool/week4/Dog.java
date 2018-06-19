package pl.cschool.week4;

public class Dog extends Animal implements Coder {


    public Dog() {
        System.out.println("Tworzę obiekt pies");
    }

    @Override
    public void move() {
        System.out.println("Pies chodzi");
    }


    public void drink() {
        System.out.println("Pies też musi jeść");
    }

    @Override
    public void eat2() {
        System.out.println("Jemy...");
    }

    @Override
    public void sleep() {
        System.out.println("Spimy...");
    }

    @Override
    public void code() {
        System.out.println("Kodujemy...");
    }

    @Override
    public void repeat() {
        System.out.println("Powtarzamy...");
    }
}
