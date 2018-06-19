package pl.cschool.week4;

import java.util.ArrayList;
import java.util.List;

public class Workspace {

    public static void main(String[] args) {

   //     Cat cat = new Cat();
    //    Dog dog = new Dog();


        List<Employee> emplys = new ArrayList<>();
        emplys.add(new Employee("AA", new HouseCat()));
        emplys.add(new Employee("BB",new HouseCat()));
        emplys.add(new Employee("CC",new HouseCat()));

        Company cmpy = new Company(emplys);
        System.out.println(cmpy);

        Human h = new Human();  //konstruktor z Animal, potem tworzymy obiekt HouseCat (wywolane kolejno kostruktory Animal, Cat, HouseCat), na koncu konstruktor Human

        System.out.println(h.getMyCat());
        System.out.println();

        Human h2 = new Human(new HouseCat());
        h2.getMyCat();


         System.out.println();

         Animal animal = new Cat();
         animal.move();

         ((Cat) animal).eat();
         Cat myCat = (Cat) animal;
         myCat.move();
         myCat.eat();

         Object o = getCat();

         if (o instanceof Cat) {
             System.out.println("Jest nowy Kot");
             Cat myKotek = (Cat) o;
             ((Cat) o).move();
             ((Cat) o).eat();
         }





     //   HouseCat koteczek = new HouseCat(7, 9, 10);

     //   cat.move();
      //  System.out.println(cat.size);
       // cat.move(3);
       // dog.move(12L);
       // cat.eat();
       // System.out.println(cat.longsize);
       // dog.eat();

    }

    public static Cat getCat() {
        return new Cat();
    }

    public static Dog getDog() {
        return new Dog();
    }

    public static Penguin getPenuin() {
        return new Penguin();
    }

}
