import java.util.LinkedList;

public class Graph {
    private int noOfNodes;
    private LinkedList<Integer> adjacencyList[];
    int total_time;

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
        adjacencyList[w].add(v);
    }

    public void hasPath(int c_edge, boolean nodes[],boolean articulationPoints[], int d[], int l[],int parent[])
    {

        nodes[c_edge] = true; //all the visited nodes becomes true
        int a_edge;
        int i= 0;
        int children_count = 0;
        d[c_edge] = l[c_edge] = ++total_time;


        while (i<adjacencyList[c_edge].size())
        {
            a_edge = adjacencyList[c_edge].get(i);
            if(nodes[a_edge]==false)   // if a is false means it is not visited
            {
                parent[a_edge] = c_edge;
                children_count++;
                //System.out.println(children_count+"CHILD COUNT");
                hasPath(a_edge,nodes,articulationPoints,d,l,parent); // then recall the method to travers through it
                l[c_edge] = Math.min(l[c_edge],l[a_edge]); //find the minimum from current and the adjacency edge to check the parent-child connection

                //checks for the root node
                if (children_count>1)
                {
                    articulationPoints[c_edge] = true;
                }
                //checks for articulation points using l[v]>=d[u]
                if (l[a_edge]>=d[c_edge])
                {
                    articulationPoints[c_edge] = true;
                }


            }
            else
            {
                l[c_edge]=Math.min(l[c_edge],d[a_edge]);
            }
            i++;
        }

    }

    public void findCutVertices_DFS()
    {
        boolean visited[] = new boolean[noOfNodes];
        boolean articulationPoints[] = new boolean[noOfNodes];
        int min_time[] = new int[noOfNodes];
        int parent[] = new int[noOfNodes];
        int d_time[] = new int[noOfNodes];

        for (int i=0; i < noOfNodes; i++)
        {
            if (!visited[i])
            {
                hasPath(i,visited,articulationPoints,d_time,min_time,parent);
            }
        }

        for (int i=0;i<noOfNodes;i++)
        {
            if(articulationPoints[i]==true)
            {
                System.out.println(i+" ");
            }
        }

    }
}
