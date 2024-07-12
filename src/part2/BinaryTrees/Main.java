package part2.BinaryTrees;

public class Main {
    public static void main(String[] args){
        //Create Binary Tree - Interview Question
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);

        Tree tree2 = new Tree();
        tree2.insert(7);
        tree2.insert(4);
        tree2.insert(9);
        tree2.insert(1);
        tree2.insert(6);
        tree2.insert(8);
        tree2.insert(10);

        var find = tree.find(10);
        System.out.println(find);

        tree.traversePreOrder();
        tree.traverseInOrder();
        tree.traversePostOrder();

        System.out.println((tree.height()));
        System.out.println(tree.min() );

        //Checking equality of 2 trees using recursion
        System.out.println(tree.equals(tree2));

        //check whether is Binary search tree
        System.out.println(tree.isBinarySearchTree());

        //Nodes at K distance from the route
        var items = tree.getNodesAtDistance(0);
        for (int item : items)
            System.out.println(item);

        //Level order traversal
        tree.traversalLevelOrder();

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
