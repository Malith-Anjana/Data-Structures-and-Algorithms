package Data_Structures1.HashTable.HashMap;

import java.util.*;

public class Main {
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Mosh");
        map.put(2, "John");
        map.put(3, "Smith");
        map.put(null, null);
        map.remove(null);

        System.out.println(map.get(3));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("John"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get(3));

        for(int key : map.keySet()){
            System.out.println(key);
        }

        for(var value : map.entrySet()){
            System.out.println(value);
            System.out.println(value.getKey());
            System.out.println(value.setValue("Test"));
        }



        //First Non Repeated character in the string - Interview Question
        Charfinder charfinder = new Charfinder();
        char character = charfinder.findFirstNonRepeatingChar("aaaav");
        System.out.println("Character is: " + character);
    }
}
