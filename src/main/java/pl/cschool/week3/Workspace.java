package pl.cschool.week3;

import javax.swing.text.html.HTMLDocument;
import java.util.*;
import java.util.stream.Stream;
public class Workspace {

    public static void main(String[] args) {



        UUID uniqueKey = UUID.randomUUID();
        System.out.println (uniqueKey);
/*
        HashMap<Integer,String> myHashMap = new HashMap<>();
        String q="";
        for (Integer i=0; i<20; i++) {
            q+="a";
            myHashMap.put(i, q);
        }

        System.out.println(myHashMap.values());
*/
        HashMap<String, HashSet<Integer>> map = new HashMap<>();

        HashSet<Integer> set1= new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();


        Animal animal1 = new Animal("lew");
        Animal animal2 = new Animal("kot");
        Animal animal3 = new Animal("pies");
        Animal animal4 = new Animal("slon;");
        Animal animal5 = new Animal("zebra");

        set1.add(9);
        set1.add(89);
        set2.add(789);
        set2.add(5);
        set3.add(65);

        map.put("A",set1);
        map.put("B",set2);
        map.put("C",set3);


      //  System.out.println(map.values());
     //   set1.stream().forEach(System.out::println);
  //      Map.Entry<String,HashSet<Animal>> entry = (Map.Entry) map.entrySet();
      //  System.out.println();

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(16);
        myList.add(6);
        myList.add(14);
        myList.add(3);

        myList.stream().forEach(System.out::println);

        System.out.println(myList);
        Collections.sort(myList);
        System.out.println(myList);

        System.out.println();

// ******* I. drukowanie po hashmap hashset
//        for(String d : map.keySet()) {
  //          for (Integer c : map.get(d) ) {
    //            System.out.println(c);
      //      }
      //  }

       // System.out.println();
// *********** drukowanie II
    //    for (HashSet<Integer> z : map.values())
      //  {
        //    Iterator iterator1 = z.iterator();
        //    while (iterator1.hasNext()) {
         //       System.out.println(iterator1.next());
         //   }
      //  }

     //   System.out.println();


   //     Iterator iterator = map.values().iterator();
     //   while (iterator.hasNext()) {
      //      System.out.println(iterator.next());
      //  }

      //  System.out.println();
        // ***************** III. z użyciem stream() i flatMap()
        map.values().stream().flatMap(s->s.stream()).forEach(System.out::println);

        System.out.println();

// ***** nie najlepszy sposób duplikuje!
        for (Map.Entry<String,HashSet<Integer>> entry : map.entrySet()) {
            System.out.println("Key :: " + entry.getKey());
            for(Integer value : entry.getValue()) {
                System.out.println("Value :: " + entry.getValue());
            }
        }
        System.out.println();
// ********** działa ok. sposób I
        for(String d : map.keySet()) {
            for (Integer c : map.get(d) ) {
                System.out.println(c);
            }
        }


        System.out.println();
//****************** sposób IV też działa
        Iterator<Map.Entry<String, HashSet<Integer>>> itr1 = map.entrySet().iterator();

        while (itr1.hasNext()) {
            Map.Entry<String, HashSet<Integer>> entry = itr1.next();
           // System.out.println(entry.getKey());  // jeśli chcemy możemy wydrukowć klucze
            Iterator<Integer> itr2 = entry.getValue().iterator();

            while (itr2.hasNext()) {
                System.out.println(itr2.next());
            }
        }




// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//flatMap(s->s.stream()).

      /*
        List<Object> p = new ArrayList<>(); //Collections.EMPTY_LIST;

        ArrayList<String> myList = new ArrayList<>();
        String k="";
        for (int i=0; i<10; i++) {
            k+="*^";
            myList.addCar(k);
        }

        Collections.addAll(p,myList);

      //  p.addCar("hjjk");

        System.out.println(p);

        for(int i=0; i<p.size(); i++) {
            System.out.println(p.get(i));
        }

*/

      //  System.out.println(p);


/*
        HashMap<Integer,String> myHashMap = new HashMap<>();
        String s="";
        for (Integer i=0; i<20; i++) {
            s+="a";
            myHashMap.put(i, s);
        }
      //  System.out.println(myHashMap);

        HashMap<Integer,ArrayList<String>> newHashMap = new HashMap<>();
        ArrayList<String> myList = new ArrayList<>();
        String k="";
        for (int i=0; i<3; i++) {
            k+="*^";
            myList.addCar(k);
        }

        for (Integer i=0; i<5; i++) {
            newHashMap.put(i*10, myList);
        }
      //  System.out.println(newHashMap);

        for(Map.Entry<Integer,ArrayList<String>> entry : newHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " +
                    entry.getValue());
        }



        //key
        for (Integer key : myHashMap.keySet()) {
            System.out.println(key + ":");
        }
        //values
        for (String value : myHashMap.values()) {
            System.out.println(value);
        }
        myHashMap.put(null, "ert");
        myHashMap.put(2, null);

        myHashMap.remove(15);
        myHashMap.remove(1,"aa");
        myHashMap.replace(0,"a","bb");
        myHashMap.replace(3,"qq");

        TreeMap<Integer,String> myTreeMap = new TreeMap<>();
        String q="";
        for (Integer i=0; i<10; i++) {
            q+="o";
            myTreeMap.put(i,q);
        }
        System.out.println();
        myTreeMap.replace(2,"qewwww");
        myTreeMap.put(1,"fdsf");
        myTreeMap.replace(8,"bvcx");
        myHashMap.put(null,"aaa");

        for(Map.Entry<Integer,String> entry : myTreeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " +
                    entry.getValue());
        }
        System.out.println();

       // myHashMap.put(null, null);
      //  Map.Entry<Integer,String> entry = (Map.Entry) myHashMap.entrySet();

        for(Map.Entry<Integer, String> entry : myHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " +
                    entry.getValue());
        }

*/

      //  printMap(myHashMap);

        // Hulk hulk = new Hulk();
       // hulk.multiTaskSkills();

        /*
        List myCollection = new ArrayList<Integer>();

        for (int i = 1; i<10; i++){
            myCollection.addCar((Integer)i);
            System.out.println(myCollection.get(i-1));
        }
        System.out.println("Size: " + myCollection.size());
        myCollection.addCar(5,122);
        myCollection.addCar(7,122);
        myCollection.addCar(3,5);
        myCollection.addCar(4,8);
        myCollection.addCar(6,8);
        System.out.println("New size: " + myCollection.size());
        System.out.println();

        System.out.println("Czy zawiera " + myCollection.contains(3));
        System.out.println("Wartość na indeksie 5: " + myCollection.get(5));

        ArrayList<Integer> arr = new ArrayList<>();
        arr.addCar(3);
        arr.addCar(4);
        arr.addCar(8);

        System.out.println("Czy zawiera kolekcję: " + myCollection.containsAll(arr));

        Iterator iterator = myCollection.iterator();
        while (iterator.hasNext()) {
           // Integer k = (Integer) iterator.next();
            System.out.print(iterator.next());
            System.out.print("  ");
        }

        myCollection.addAll(arr);
        System.out.println();

        //myCollection.remove(6);  // po index
        myCollection.remove((Integer)122); //po Object

        Iterator iterator2 = myCollection.iterator();
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next());
            System.out.print("  ");
        }

        myCollection.removeAll(arr);
        System.out.println();

        Iterator iterator3 = myCollection.iterator();
        while (iterator3.hasNext()) {
            System.out.print(iterator3.next());
            System.out.print("  ");
        }

        System.out.println();

        Set myHashSet = new HashSet<>();
        myHashSet.addCar("a");
        myHashSet.addCar("b");
        myHashSet.addCar("C");
        myHashSet.addCar("A");
        myHashSet.addCar("Ab");
        myHashSet.addCar("aD");
        myHashSet.addCar(3);
        myHashSet.addCar(4);
        myHashSet.addCar(8);

        Iterator iterator4 = myHashSet.iterator();
        while (iterator4.hasNext()) {
            System.out.print(iterator4.next());
            System.out.print("  ");
        }
        System.out.println();
        myHashSet.size();
        System.out.println();
        System.out.println(myHashSet.containsAll(arr));

        System.out.println(myHashSet.contains("C"));

*/


    }

    public static void printMap(Map<Integer, String> map) {

        //  Map.Entry<Integer, String> entry = (Map.Entry) map.entrySet();

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " +
                    entry.getValue());
        }
    }


}
