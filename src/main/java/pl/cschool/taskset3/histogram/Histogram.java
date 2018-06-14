package pl.cschool.taskset3.histogram;

import java.util.*;

public class Histogram {

    public static HashMap<Integer, Integer> makeDistribution(ArrayList<Integer> arr) {
        HashMap<Integer,Integer> distrMap=  new HashMap<>();
       // Collections.sort(arr);
        for (Integer k : arr) {
            if (!distrMap.containsKey(k)) distrMap.put(k,1);
            else distrMap.put(k,distrMap.get(k)+1);
        }
        return distrMap;
    }

    public static void printMap(Map<Integer,Integer> map) {
       // Map <Integer, Integer> treeMap = new TreeMap<String, String>(map);
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " +
                    entry.getValue());
        }
    }

    public static String histogramToString(Map<Integer, Integer> map) {
        StringBuilder result = new StringBuilder();
        for(Map.Entry entry : map.entrySet() ) {
            result.append(entry.getKey() + "\t");
            for (Integer j=1; j<=(int)entry.getValue(); j++) {
                result.append("*");
            }
            result.append("\n");
        }
        return  result.toString();
    }
}
