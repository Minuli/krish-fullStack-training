import java.util.LinkedList;

public class Graph {
    private int noOfNodes;
    private LinkedList<Integer> adjacencyList[];

    //creating the graph
    public Graph(int n_nodes)
    {
        noOfNodes = n_nodes;
        adjacencyList = new LinkedList[n_nodes]; // stores notVisited nodes
        for (int i=0; i<n_nodes; i++)
        {
            //nodes --> Linked list entities
            adjacencyList[i] = new LinkedList<>();
        }
    }


    public void addEdge(int v,int w)
    {
        adjacencyList[v].add(w);
    }

    public void hasPath(int edge, boolean nodes[])
    {

        nodes[edge] = true; //all the visited nodes becomes true
        int a;
        int i= 0;
        System.out.print(edge + " ");

        while (i<adjacencyList[edge].size())
        {
            a = adjacencyList[edge].get(i);
            if(nodes[a]==false)   // if a is false means it is not visited
            {
                hasPath(a,nodes); // then recall the method to travers through it
            }
            i++;
        }

    }

    public void DepthFirstSearch(int root)
    {
        boolean visited[] = new boolean[noOfNodes];
        hasPath(root,visited);
    }
}
