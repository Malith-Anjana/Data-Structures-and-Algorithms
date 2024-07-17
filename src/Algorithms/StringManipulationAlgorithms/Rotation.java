package Algorithms.StringManipulationAlgorithms;

public class Rotation {
    //ABCD -> DABC -> CDAB -> BCDA -> ABCD
    //Check one of this rotation of other one\
    //solution = check whether ABCDABCD contains string 2 (ex: "CDAB")

    public static boolean isRotation(String str1, String str2){
        if (str1 == null || str2 == null)
            return false;
        if((str1 + str1).contains(str2) && str1.length() == str2.length())
            return true;
        return false;
    }


    //implement using for loop
    public static boolean isRotation2(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        int length = str1.length();

        // Check each rotation
        for (int i = 0; i < length; i++) {
            String rotated = str1.substring(i) + str1.substring(0, i);
            if (rotated.equals(str2)) {
                return true;
            }
        }
        return false;
    }

}
