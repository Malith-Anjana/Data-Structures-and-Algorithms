package Data_Structures1.HashTable.HashSet;

import java.util.HashSet;
import java.util.Set;

//First repeated character in the string - Interview Question
public class CharFinder {
    public char findFirstRepeatedChar (String str){
        Set<Character> set = new HashSet<>();

        for (var ch : str.toCharArray()){
            if(set.contains(ch))
                return ch;

            set.add(ch);
        }

        return Character.MIN_VALUE;
    }
}
