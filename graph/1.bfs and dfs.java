/Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        //boolean list to mark all the vertices as not visited.
        boolean visited[] = new boolean[V];
        
        int s = 0;
        //initially we mark first vertex as visited(true).
        visited[s] = true;  
        
        ArrayList<Integer> res = new ArrayList<>();
        
        //creating a queue for BFS and pushing first vertex in queue.
        LinkedList<Integer> q = new LinkedList<Integer>();
        q.add(s);
        
        while (q.size() != 0)
        {
            //adding front element in output list and popping it from queue.
            s = q.poll();
            res.add(s);

            //traversing over all the connected components of front element.
            Iterator<Integer> i = adj.get(s).listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                //if they aren't visited, we mark them visited and add to queue.
                if (!visited[n])
                {
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
        //returning the output list.
        return res;
    }
}





***********************
dfs

void DFSUtil(int v, boolean visited[])
    {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");
 
        // Recur for all the vertices adjacent to this
        // vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }
 
    // The function to do DFS traversal.
    // It uses recursive
    // DFSUtil()
    void DFS(int v)
    {
        // Mark all the vertices as
        // not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[V];
 
        // Call the recursive helper
        // function to print DFS
        // traversal
        DFSUtil(v, visited);
    }
