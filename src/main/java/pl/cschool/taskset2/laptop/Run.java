package pl.cschool.taskset2.laptop;

public class Run {

    public static void main(String[] args) {

        Laptop myLaptop = new Laptop("Acer", "Aspire 3", 15.6);
        myLaptop.setRam(4);
        myLaptop.setHardDriveCapacity(32);
        myLaptop.setOperatingSystem("Windows 10");
        System.out.println(myLaptop.toString());
        Processor myProcessor = new Processor();
        myProcessor.setType("Intel Celeron");
        myProcessor.setSpeed(1.1);
        System.out.println(myProcessor.toString());
        myLaptop.setProcessor(myProcessor);
        System.out.println(myLaptop.toString());

        Laptop laptopOne = new Laptop("Dell", "Inspiron", 14);
        laptopOne.setRam(8);
        laptopOne.setHardDriveCapacity(120);
        laptopOne.setOperatingSystem("Windows 10");
        Processor processorOne = new Processor("Intel Core",2.9);
        laptopOne.setProcessor(processorOne);
        System.out.println(laptopOne.toString());
        System.out.println(processorOne.toString());

    }
}
