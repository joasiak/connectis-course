package pl.cschool.taskset1;

import org.junit.Test;

import java.util.Random;

public class HistogramTest {

    @Test
    public void makeDistributionTest() {
        int[] arr = generateArr(100, 30);
        Histogram.printMap(Histogram.makeDistribution(arr));
    }

    static int[] generateArr(int listSize, int range) {
        Random rnd = new Random();
        int[] myList = new int[listSize];
        for (int i =0; i< listSize; i++) {
            myList[i]=rnd.nextInt(range);
        }
        return myList;
    }
}