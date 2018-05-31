package pl.cschool.week1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Histogram {

    public static HashMap<Integer, Integer> makeDistribution(int[] arr) {
        HashMap<Integer,Integer> distrMap=  new HashMap<>();
        arr=sortList(arr);
        for (Integer k : arr) {
            if (!distrMap.containsKey(k)) distrMap.put(k,1);
            else distrMap.put(k,distrMap.get(k)+1);
        }
        return distrMap;
    }

    public static int[] sortList(int[] arr) {
        int temp;
        do {
            for (int i=0; i<arr.length-1; i++) {
                if (arr[i]>arr[i+1]) {
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        } while (!isSorted(arr));
        return arr;
    }

    public static boolean isSorted(int[] arr) {
        boolean isSorted=true;
        for(int i=0; i<arr.length-1; i++) {
            if (arr[i]>arr[i+1]) isSorted=false;
        }
        return isSorted;
    }

    public static void printMap(HashMap<Integer,Integer> map) {
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " +
                        entry.getValue());
            }
    }

}
