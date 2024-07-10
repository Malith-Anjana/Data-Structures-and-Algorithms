package part1.HashTable.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        int[] keys = {1, 2, 3, 4, 7, 6, 6, 7, 7, 5};

        for (int key : keys){
            set.add(key);
        }

        System.out.println(set);


        //First repeated character in the string - Interview Question
        CharFinder finder = new CharFinder();
        var ch = finder.findFirstRepeatedChar("a green apple");
        System.out.println(ch);

    }
}
