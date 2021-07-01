final int V = 4;
    int color[];
 
    /* A utility function to check
       if the current color assignment
       is safe for vertex v */
    boolean isSafe(
        int v, int graph[][], int color[],
        int c)
    {
        for (int i = 0; i < V; i++)
            if (
                graph[v][i] == 1 && c == color[i])
                return false;
        return true;
    }
 
    /* A recursive utility function
       to solve m coloring  problem */
    boolean graphColoringUtil(
        int graph[][], int m,
        int color[], int v)
    {
        /* base case: If all vertices are
           assigned a color then return true */
        if (v == V)
            return true;
 
        /* Consider this vertex v and try
           different colors */
        for (int c = 1; c <= m; c++)
        {
            /* Check if assignment of color c to v
               is fine*/
            if (isSafe(v, graph, color, c))
            {
                color[v] = c;
 
                /* recur to assign colors to rest
                   of the vertices */
                if (
                    graphColoringUtil(
                        graph, m,
                        color, v + 1))
                    return true;
 
                /* If assigning color c doesn't lead
                   to a solution then remove it */
                color[v] = 0;
            }
        }
 
        /* If no color can be assigned to
           this vertex then return false */
        return false;
    }
 
   
    boolean graphColoring(int graph[][], int m)
    {
        // Initialize all color values as 0. This
        // initialization is needed correct
        // functioning of isSafe()
        color = new int[V];
        for (int i = 0; i < V; i++)
            color[i] = 0;
 
        // Call graphColoringUtil() for vertex 0
        if (
            !graphColoringUtil(
                graph, m, color, 0))
        {
            System.out.println(
                "Solution does not exist");
            return false;
        }
 
        // Print the solution
        printSolution(color);
        return true;
    }
 
    /* A utility function to print solution */
  
 
    // driver program to test above function
    public static void main(String args[])
    {
       
        int graph[][] = {
            { 0, 1, 1, 1 },
            { 1, 0, 1, 0 },
            { 1, 1, 0, 1 },
            { 1, 0, 1, 0 },
        };
        int m = 3; // Number of colors
        Coloring.graphColoring(graph, m);
        
        
        Method 3:  Using BFS

The approach here is to color each node from 1 to n initially by color 1. And start travelling BFS from an unvisited starting node to cover all connected components in one go. On reaching each node during BFS traversal, do the following:

Check all edges of the given node.
For each vertex connected to our node via an edge:
check if the color of the nodes is the same. If same, increase the color of the other node (not the current) by one.
check if it visited or unvisited. If not visited, mark it as visited and push it in a queue.
Check condition for maxColors till now. If it exceeds M, return false
