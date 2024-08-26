package hashmap;

import java.util.*;

public class hashing {
    public static void main(String[] args) {
        //country(key) , population(value)
        HashMap<String, Integer> kuchbhi = new HashMap<>();


        //insertion
        kuchbhi.put("india", 120);
        kuchbhi.put("china", 345);
        kuchbhi.put("russia", 300);
        kuchbhi.put("america", 204);
        //value update hojaega america ka yahan
        kuchbhi.put("america", 2040);
        //unorderedhota hashmap, kuch bhi print hoga
        System.out.println(kuchbhi);

        //search :-

        if (kuchbhi.containsKey("china")) {
            System.out.println("present in the map");
        } else {
            System.out.println("not present");
        }
        System.out.println(kuchbhi.get("china")); //key exists
        System.out.println(kuchbhi.get("pakistan")); //key doesn't exists

        // Iteration : -
        //for(int val : arr)
        for (Map.Entry<String, Integer> e : kuchbhi.entrySet()) {
            System.out.print(e.getKey()+":");
            System.out.println(e.getValue());
        }
        Set<String> chabhi = kuchbhi.keySet();
        for(String key : chabhi){
            System.out.println(key +" " + kuchbhi.get(key));
        }

        //deletion :-
        kuchbhi.remove("china");
        System.out.println(kuchbhi);
    }
}
