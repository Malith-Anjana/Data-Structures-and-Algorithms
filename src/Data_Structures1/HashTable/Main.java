package Data_Structures1.HashTable;

public class Main {
    public static void main(String[] args){
        HashTable table = new HashTable();
        table.put(6, "A"); //1
        table.put(8, "B"); //3
        table.put(11, "C");
        table.put(6, "A+");

        table.remove(6);
        //Run on Debug Mode and see the table in Threads & variable Tab for how it works
        System.out.println(table.get(6));
    }
}
