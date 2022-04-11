import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    private int noOfNodes;
    private LinkedList<Integer> adjacencyList[];
    private Queue<Integer> visitedQueue;

    //creating the graph
    public Graph(int n_nodes)
    {
        noOfNodes = n_nodes;
        adjacencyList = new LinkedList[n_nodes];
        for (int i=0; i<n_nodes; i++)
        {
            //nodes --> Linked list entities
            adjacencyList[i] = new LinkedList<>();
        }
        visitedQueue = new LinkedList<>();
    }


    public void addEdge(int v,int w)
    {

        adjacencyList[v].add(w);
    }


    public void BreadthFirstSearch(int root)
    {

        boolean nodes[] = new boolean[noOfNodes];
        int a = 0;

        nodes[root]=true;
        visitedQueue.add(root);
        //root node is added to the top of the queue

        while (visitedQueue.size() != 0)
        {
            root = visitedQueue.poll();             //remove the first element of the queue
            System.out.print(root+" ");

            for (int i = 0; i < adjacencyList[root].size(); i++)  // iterating and pushing all the neighbours to the queue
            {
                a = adjacencyList[root].get(i);
                if (!nodes[a])                  // validation to add nodes that haven't been explored
                {
                    nodes[a] = true;
                    visitedQueue.add(a);
                }
            }
        }
    }
}
