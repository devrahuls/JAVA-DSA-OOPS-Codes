package com.rahul;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Rahul", 76);
        map.put("Kunal", 75);
        map.put("Vaibhav", 90);

        System.out.println(map.get("Vaibhav"));//Gives the value of the 'Vaibhav' key.

        //Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
        System.out.println(map.getOrDefault("Naitik", 80));
        System.out.println(map.containsKey("Kunal")); //Checks if the key exist in the object or not.


        HashSet<Integer> set = new HashSet<>(); //Adding or Removing in O(1) time as a set of objects.
        set.add(90);
        set.add(20);
        set.add(90);
        set.add(30);
        set.add(70);
        set.add(40);
        set.add(36);
        System.out.println(set);


        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Rahul", 76);
            treeMap.put("Kunal", 190);
        treeMap.put("Vaibhav", 90);
        System.out.println(treeMap); //Works similar like HashMap but returns objects as in Ascending order.


    }
}