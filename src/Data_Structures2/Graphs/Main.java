package Data_Structures2.Graphs;

public class Main {
    public static void main(String[] args){
        var graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.removeEdge("A", "D");
        graph.addEdge("B", "C");
        graph.traverseDepthFirst("A");
        graph.traverseDepthFirstRec("B");
        graph.traverseBreadthFirst("B");
        graph.print();
        var list = graph.topologicalSort();
        System.out.println(list);
        System.out.println(graph.hasCycle());


        //Implement Weighted Graph
        var wg = new WeightedGraph();
        wg.addNode("A");
        wg.addNode("B");
        wg.addNode("C");
        wg.addEdge("A", "B",3);
        wg.addEdge("A", "C", 2);

        wg.print();
        var path = wg.getShortestPath("A", "B");
        System.out.println(path);
        System.out.println(wg.hasCycle());
    }
}
