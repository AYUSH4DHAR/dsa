 void dijkstra(int graph[][], int src)
    { 
   int dist[] = new int[V]; // The output array. dist[i] will hold
        // the shortest distance from src to i
   Boolean sptSet[] = new Boolean[V];
  
        // Initialize all distances as INFINITE and stpSet[] as false
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }
  
        // Distance of source vertex from itself is always 0
        dist[src] = 0;
   for (int count = 0; count < V - 1; count++) {
            // Pick the minimum distance vertex from the set of vertices
            // not yet processed.
        int u = minDistance(dist, sptSet);
  
            // Mark the picked vertex as processed
            sptSet[u] = true;
      for (int v = 0; v < V; v++)
  // Update dist[v] only if is not in sptSet
        if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
                     dist[v] = dist[u] + graph[u][v];
   }}
print(dist[]);
}


 int minDistance(int dist[], Boolean sptSet[])
    {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index = -1;
  
        for (int v = 0; v < V; v++)
            if (sptSet[v] == false && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }
  
        return min_index;
    }
