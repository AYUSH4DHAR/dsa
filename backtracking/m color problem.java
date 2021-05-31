static boolean isSafe(boolean[][] graph, int[] color)
  {
    // check for every edge
    for (int i = 0; i < V; i++)
      for (int j = i + 1; j < V; j++)
        if (graph[i][j] && color[j] == color[i])
          return false;
    return true;
  }
 
  
  static boolean graphColoring(boolean[][] graph, int m,
                               int i, int[] color)
  {
    // if current index reached end
    if (i == V) {
 
      // if coloring is safe
      if (isSafe(graph, color))
      {
 
        // Print the solution
        printSolution(color);
        return true;
      }
      return false;
    }
 
    // Assign each color from 1 to m
    for (int j = 1; j <= m; j++)
    {
      color[i] = j;
 
      // Recur of the rest vertices
      if (graphColoring(graph, m, i + 1, color))
        return true;
      color[i] = 0;
    }
    return false;
  }
  boolean[][] graph = {
      { false, true, true, true },
      { true, false, true, false },
      { true, true, false, true },
      { true, false, true, false },
    };
    int m = 3; // Number of colors
 
    // Initialize all color values as 0.
    // This initialization is needed
    // correct functioning of isSafe()
    int[] color = new int[V];
    for (int i = 0; i < V; i++)
      color[i] = 0;
    if (!graphColoring(graph, m, 0, color))
      System.out.println("Solution does not exist");
  }
}
// This code is contributed
