Boolean isCyclicUtil(int v, 
                 Boolean visited[], int parent, ArrayList<ArrayList<Integer>> adj)
    {
        //marking the current vertex as visited.
        visited[v] = true;
        Integer i;

        Iterator<Integer> it = adj.get(v).iterator();
        while (it.hasNext())
        {
            i = it.next();

            //if an adjacent is not visited, then calling function 
            //recursively for that adjacent vertex.
            if (!visited[i])
            {
                if (isCyclicUtil(i, visited, v, adj))
                    return true;
            }

            //if an adjacent is visited and it is not a parent of current
            //vertex then there is a cycle and we return true.
            else if (i != parent)
                return true;
        }
        return false;
    }
    
    //Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        //using a boolean list to mark all the vertices as not visited.
        Boolean visited[] = new Boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;

        //iterating over all the vertices.
        for (int u = 0; u < V; u++)
        {  
            //if vertex is not visited, we call the function to detect cycle.
            if (!visited[u]) 
                
                //if cycle is found, we return true.
                if (isCyclicUtil(u, visited, -1, adj))
                    return true;
        }

        return false;
    }
}
