package pl.cschool.taskset3.dog;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class HistogramDogTest {

    @Test
    public void test1() {

        //Given
        ArrayList<Dog> list = new ArrayList<>();
        list.add(new Dog("Azor", "Pudel", 2010));
        list.add(new Dog("Kropka", "Bokser", 2015));
        list.add(new Dog("Azor", "Pudel", 2010));
        list.add(new Dog("Corep", "Jamnik", 2017));
        list.add(new Dog("Czarny", "Pudel", 2004));
        list.add(new Dog("Burek", "Bokser", 2014));
        list.add(new Dog("Czarny", "Pudel", 2004));
        list.add(new Dog("Luna", "Dalmatyńczyk", 2017));
        list.add(new Dog("Czarny", "Pudel", 2004));
        list.add(new Dog("Mucha", "York", 2009));
        list.add(new Dog("Kropka", "Bokser", 2015));
        list.add(new Dog("Mucha", "York", 2009));
        list.add(new Dog("Mucha", "York", 2009));

        //When
        HashMap<Dog,Integer> histogram = HistogramDog.makeDistribution(list);

        HistogramDog.printMap(histogram);
     //   System.out.println(HistogramDog.histogramToString(histogram));

        //Then
        HashMap<Dog, Integer> expected = new HashMap<>();
        expected.put(new Dog("Azor", "Pudel", 2010),2);
        expected.put(new Dog("Burek", "Bokser", 2014),1);
        expected.put(new Dog("Mucha", "York", 2009),3);
        expected.put(new Dog("Corep", "Jamnik", 2017),1);
        expected.put(new Dog("Czarny", "Pudel", 2004),3);
        expected.put(new Dog("Kropka", "Bokser", 2015),2);
        expected.put(new Dog("Luna", "Dalmatyńczyk", 2017),1);

        assertEquals(expected.size(), histogram.size());
        for (Map.Entry entry : histogram.entrySet()) {
            assertEquals(expected.get(entry.getKey()), entry.getValue());
        }
    }
}
