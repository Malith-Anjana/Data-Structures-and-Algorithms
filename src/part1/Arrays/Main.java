package part1.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main (String[] args){
        //array in action
        int [] numberss = new int[3];
        Character [] characters = {'a', 'b', 'c'};
       //System.out.println(Arrays.toString(characters));
        numberss[1]=2;
       //System.out.println(Arrays.toString(numberss));

        //Implement array Class-> Exercise
        Array numbers = new Array(3);
        numbers.insert(2);
        numbers.insert(6);
        numbers.insert(7);
        numbers.insert(10);
        numbers.insert(9);
        numbers.removeAt(1);
        System.out.println(numbers.indexOf(7));
        numbers.print();

        

    }
}
