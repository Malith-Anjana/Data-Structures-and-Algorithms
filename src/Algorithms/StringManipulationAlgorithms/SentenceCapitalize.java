package Algorithms.StringManipulationAlgorithms;

public class SentenceCapitalize {
    public static String capitalize(String sentence){
        if (sentence == null || sentence.trim().isEmpty())
            return "";

        String[] words = sentence.trim().replaceAll(" +", " ").split(" ");

        for (var i = 0; i < words.length; i++){
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        return String.join(" ", words);
    }
}
