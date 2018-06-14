package pl.cschool.taskset3.histogram;

import org.junit.Test;
import pl.cschool.week2.Tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;

public class HistogramTest {

    @Test
    public void test1() {

        //Given
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);arr.add(18);arr.add(71);arr.add(22);
        arr.add(71);arr.add(22);arr.add(37);arr.add(97);arr.add(32);
        arr.add(18);arr.add(22);arr.add(37);arr.add(12);arr.add(18);

        //When
        HashMap<Integer,Integer> histogram = Histogram.makeDistribution(arr);

        Histogram.printMap(histogram);
        System.out.println(Histogram.histogramToString(histogram));

        //Then
        HashMap<Integer, Integer> expected = new HashMap<>();
        expected.put(12,2);
        expected.put(18,3);
        expected.put(22,3);
        expected.put(32,1);
        expected.put(37,2);
        expected.put(71,2);
        expected.put(97,1);

        assertEquals(expected.size(), histogram.size());
        for (Map.Entry entry : histogram.entrySet()) {
                assertEquals(expected.get(entry.getKey()), entry.getValue());
            }
        }
}
