package pl.cschool.taskset3.dog;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HistogramDog {

    public static HashMap<Dog, Integer> makeDistribution(ArrayList<Dog> list) {
        HashMap<Dog,Integer> map=  new HashMap<>();
        for (Dog k : list) {
            if (!map.containsKey(k)) map.put(k,1);
            else map.put(k,map.get(k)+1);
        }
        return map;
    }

    public static void printMap(HashMap<Dog,Integer> map) {
        // Map <Integer, Integer> treeMap = new TreeMap<String, String>(map);
        for(Map.Entry<Dog, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " +
                    entry.getValue());
        }
    }

}
