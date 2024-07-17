package Data_Structures2.Tries;

public class Main {
    public static void main(String[] args){
        //run using debugger
        var trie = new Trie();
        trie.insert("car");
        trie.insert("card");
        trie.insert("care");
        trie.insert("careful");
        trie.insert("egg");
        trie.traverse();
        System.out.println(trie.contains("car"));
        System.out.println(trie.findWords("car"));
    }
}
