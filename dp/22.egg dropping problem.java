static int eggDrop(int n, int k)
    {
        // If there are no floors, then
        // no trials needed. OR if there
        // is one floor, one trial needed.
        if (k == 1 || k == 0)
            return k;
 
        // We need k trials for one egg
        // and k floors
        if (n == 1)
            return k;
 
        int min = Integer.MAX_VALUE;
        int x, res;
 
        // Consider all droppings from
        // 1st floor to kth floor and
        // return the minimum of these
        // values plus 1.
        for (x = 1; x <= k; x++) {
            res = Math.max(eggDrop(n - 1, x - 1),
                           eggDrop(n, k - x));
            if (res < min)
                min = res;
        }
 
        return min + 1;
    }
 
 *****
 Dynamic Programming using memoization.


#include <bits/stdc++.h>
using namespace std;
#define MAX 1000
 
vector<vector<int>> memo(MAX, vector<int> (MAX, -1));
int solveEggDrop(int n, int k) {
  
    if(memo[n][k] != -1) { return memo[n][k];}
     
    if (k == 1 || k == 0)
      return k;
 
    if (n == 1)
      return k;
 
    int min = INT_MAX, x, res;
 
    for (x = 1; x <= k; x++) {
      res = max(
        solveEggDrop(n - 1, x - 1),
        solveEggDrop(n, k - x));
      if (res < min)
        min = res;
    }
     
    memo[n][k] = min+1;
    return min + 1;
  }
*************************************

     int eggFloor[][] = new int[n + 1][k + 1];
        int res;
        int i, j, x;
 
        // We need one trial for one floor and
        // 0 trials for 0 floors
        for (i = 1; i <= n; i++) {
            eggFloor[i][1] = 1;
            eggFloor[i][0] = 0;
        }
 
        // We always need j trials for one egg
        // and j floors.
        for (j = 1; j <= k; j++)
            eggFloor[1][j] = j;
 
        // Fill rest of the entries in table using
        // optimal substructure property
        for (i = 2; i <= n; i++) {
            for (j = 2; j <= k; j++) {
                eggFloor[i][j] = Integer.MAX_VALUE;
                for (x = 1; x <= j; x++) {
                    res = 1 + max(
                                  eggFloor[i - 1][x - 1],
                                  eggFloor[i][j - x]);
                    if (res < eggFloor[i][j])
                        eggFloor[i][j] = res;
                }
            }
        }
 
        // eggFloor[n][k] holds the result
        return eggFloor[n][k];
    }
 
