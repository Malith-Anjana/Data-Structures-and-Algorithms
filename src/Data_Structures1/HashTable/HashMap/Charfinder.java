package Data_Structures1.HashTable.HashMap;
import java.util.HashMap;
import java.util.Map;

//First Non Repeated character in the string - Interview Question

public class Charfinder {
    public char findFirstNonRepeatingChar(String str){

        Map<Character, Integer> map = new HashMap<>();

        var chars = str.toCharArray();

        for(char ch : chars){
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count+1);
        }
        for(char ch : chars){
            if (map.get(ch) == 1)
                return ch;
        }
        return Character.MIN_VALUE;
    }
}
