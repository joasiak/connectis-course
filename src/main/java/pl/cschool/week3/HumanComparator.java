package pl.cschool.week3;

import java.util.Comparator;

public class HumanComparator implements Comparator<Human> {

 /*
    @Override
    public int compare(Human o1, Human o2) {
        return o1.age - o2.age;
    }

  */

    @Override
    public int compare(Human o1, Human o2) {
        return o1.name.length()-o2.name.length();
    }

    public String londerName(Human h1, Human h2) {
        if (compare(h1, h2) <0) return h2.name;
        return h1.name;
    }


    public String whoOlder(Human h1, Human h2) {
        if (compare(h1,h2) < 0) return h2.name;
        return h1.name;
    }



}
