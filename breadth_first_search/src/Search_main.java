import java.util.Scanner;

public class Search_main {


    public static void main(String[] args) {
        Graph graph = new Graph(6);
        Scanner scanner =  new Scanner(System.in);

        // generating the graph
        graph.addEdge(1,0);
        graph.addEdge(0,5);
        graph.addEdge(1,3);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(3,4);

        // invoking FIND ARTICULATION POINT method
        //System.out.println("Select a number from [0,1,2,3,4,5,6,7]");
        //int root = scanner.nextInt();
        graph.findCutVertices_DFS();
    }
}
