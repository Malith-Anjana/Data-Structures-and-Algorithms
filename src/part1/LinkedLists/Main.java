package part1.LinkedLists;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList lists = new LinkedList();
        //If don't add generic type (LinkedList<Integer> list = new LinkedList<>(); ...) we can store difference type of objects
        lists.addFirst(10);
        lists.addLast(30);
        lists.addLast(20);

        System.out.println(lists.contains(10));
        System.out.println(lists.indexOf(30));
        System.out.println(lists.size());
        var array = lists.toArray();
        System.out.println("1st Element: "+ lists.get(0));
        System.out.println(Arrays.toString(array));




        //Create custom LinkedLists -> Exercise
        var list = new LinkedLists();
        list.addLast(10);
        list.addLast(15);
        list.addLast(25);
        list.addFirst(50);
        list.removeFirst();
        list.removeLast();
        System.out.println(list.indexOf(15));
        System.out.println(list.contains(50));
        System.out.println(list.size());
        var arrays = list.toArray();
        System.out.println(Arrays.toString(arrays));

        System.out.println(list.getKthfromEnd(2));




    }
}
