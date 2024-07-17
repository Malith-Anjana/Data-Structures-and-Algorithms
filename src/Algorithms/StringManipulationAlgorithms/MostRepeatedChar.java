package Algorithms.StringManipulationAlgorithms;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatedChar {
    //Using hash map
    public static char getMaxOccuringChar(String str){
        Map<Character, Integer> frequency = new HashMap<>();
        String fixStr = str.replace(" ","");

        for (char ch : fixStr.toCharArray()){
            if (frequency.containsKey(ch))
                frequency.put(ch, frequency.get(ch) + 1);
            else
                frequency.put(ch, 1);
        }

        int maxFreq = 0;
        char character = ' ';

        //for (Map.Entry<Character,Integer> entry : frequency.entrySet())
        for (var entry : frequency.entrySet())
            if (entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                character = entry.getKey();
            }
        return character;

    }

    //Using regular integer array
    public static char getMaxOccuringChar2(String str){
        if (str == null || str.isEmpty())
            throw new IllegalArgumentException();

        final int ASCII_SIZE = 256;
        int[] frequencies = new int[ASCII_SIZE];

        String removedSpaces = str.replace(" ", "");

        for (char ch : removedSpaces.toCharArray())
            //cha value would be auto type cast char to int
             frequencies[ch] = frequencies[ch] + 1;

        int max = 0;
        char result = ' ';

        for (int i = 0; i < frequencies.length; i++)
            if (frequencies[i] > max){
                max = frequencies[i];
                result = (char) i;
            }


        return result;
    }
}
