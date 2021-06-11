BFS

 public GraphNode cloneGraph(GraphNode source)
    {
        Queue<GraphNode> q = new LinkedList<GraphNode>();
        q.add(source);
  
        // An HashMap to keep track of all the
        // nodes which have already been created
        HashMap<GraphNode,GraphNode> hm =
                        new HashMap<GraphNode,GraphNode>();
  
        //Put the node into the HashMap
        hm.put(source,new GraphNode(source.val));
  
        while (!q.isEmpty())
        {
            // Get the front node from the queue
            // and then visit all its neighbours
            GraphNode u = q.poll();
  
            // Get corresponding Cloned Graph Node
            GraphNode cloneNodeU = hm.get(u);
            if (u.neighbours != null)
            {
                Vector<GraphNode> v = u.neighbours;
                for (GraphNode graphNode : v)
                {
                    // Get the corresponding cloned node
                    // If the node is not cloned then we will
                    // simply get a null
                    GraphNode cloneNodeG = hm.get(graphNode);
  
                    // Check if this node has already been created
                    if (cloneNodeG == null)
                    {
                        q.add(graphNode);
  
                        // If not then create a new Node and
                        // put into the HashMap
                        cloneNodeG = new GraphNode(graphNode.val);
                        hm.put(graphNode,cloneNodeG);
                    }
  
                    // add the 'cloneNodeG' to neighbour
                    // vector of the cloneNodeG
                    cloneNodeU.neighbours.add(cloneNodeG);
                }
            }
        }
  
        // Return the reference of cloned source Node
        return hm.get(source);
    }



*****
