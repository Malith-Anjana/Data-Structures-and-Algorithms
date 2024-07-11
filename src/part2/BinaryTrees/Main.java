package part2.BinaryTrees;

public class Main {
    public static void main(String[] args){
        //Tree
        //Node(value, leftChild, rightChild)
        // Inert(value)
        // find(value) return boolean

        //Create Binary Tree - Interview Question
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(9);
        tree.insert(5);
        tree.insert(6);
        tree.insert(3);
        tree.insert(8);

        System.out.println(tree.find(11));
        System.out.println("done");


        //Recursion - ex: Calculate factorial function
        System.out.println(factorial(5));
    }

    //Recursion - ex: Calculate factorial function
    public static int factorial(int n){
        //Base condition - terminate the recursion(terminate infinite recursion)
        if (n == 0)
            return 1;
        return n * factorial(n-1);
    }
}
