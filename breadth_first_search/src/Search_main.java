public class Search_main {


    public static void main(String[] args) {
        Graph graph = new Graph(7);

        // generating the graph
        graph.addEdge(0,2);
        graph.addEdge(0,1);
        graph.addEdge(2, 6);
        graph.addEdge(2, 4);
        graph.addEdge(1, 3);
        graph.addEdge(4, 5);
        graph.addEdge(4, 6);

        // invoking breadth first search traversal method
        graph.BreadthFirstSearch(0);
    }
}
