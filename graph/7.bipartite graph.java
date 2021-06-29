import java.util.*;
 
public class GFG{
     
    static class Pair{
        int first, second;
         
        Pair(int f, int s){
            first = f;
            second = s;
        }
    }
     
    static boolean isBipartite(int V, ArrayList<ArrayList<Integer>> adj)
    {
       
        // vector to store colour of vertex
        // assiging all to -1 i.e. uncoloured
        // colours are either 0 or 1
        // for understanding take 0 as red and 1 as blue
        int col[] = new int[V];
        Arrays.fill(col, -1);
     
        // queue for BFS storing {vertex , colour}
        Queue<Pair> q = new LinkedList<Pair>();
     
        //loop incase graph is not connected
        for (int i = 0; i < V; i++) {
         
        // if not coloured
            if (col[i] == -1) {
             
            // colouring with 0 i.e. red
                q.add(new Pair(i, 0));
                col[i] = 0;
             
                while (!q.isEmpty()) {
                    Pair p = q.peek();
                    q.poll();
                 
                    //current vertex
                    int v = p.first;
                   
                    // colour of current vertex
                    int c = p.second;
                     
                    // traversing vertexes connected to current vertex
                    for (int j : adj.get(v))
                    {
                     
                        // if already coloured with parent vertex color
                        // then bipartite graph is not possible
                        if (col[j] == c)
                            return false;
                     
                        // if uncooloured
                        if (col[j] == -1)
                        {
                           
                        // colouring with opposite color to that of parent
                            col[j] = (c==1) ? 0 : 1;
                            q.add(new Pair(j, col[j]));
                        }
                    }
                }
            }
        }
       
        // if all vertexes are coloured such that
        // no two connected vertex have same colours
        return true;
    }
     
  
  
  
  *******************************************************************
    DFS
    *************************
      static boolean colorGraph(int G[][],
                              int color[],
                              int pos, int c)
    {
        if (color[pos] != -1 &&
            color[pos] != c)
            return false;
 
        // color this pos as c and
        // all its neighbours as 1-c
        color[pos] = c;
        boolean ans = true;
        for (int i = 0; i < V; i++)
        {
            if (G[pos][i] == 1)
            {
                if (color[i] == -1)
                    ans &= colorGraph(G, color, i, 1 - c);
 
                if (color[i] != -1 && color[i] != 1 - c)
                    return false;
            }
            if (!ans)
                return false;
        }
        return true;
    }
 
    static boolean isBipartite(int G[][])
    {
        int[] color = new int[V];
        for (int i = 0; i < V; i++)
            color[i] = -1;
 
        // start is vertex 0;
        int pos = 0;
     
        // two colors 1 and 0
        return colorGraph(G, color, pos, 1);
    }
 
