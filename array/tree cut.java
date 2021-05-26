// There are n trees in a forest.
//   The heights of the trees is stored in array tree[], 
// where tree[i] denotes the height of the ith tree in the forest.
//   If the ith tree is cut at a height H, then the wood collected is tree[i] - H, 
// provided tree[i] > H. If the total woods that needs to be collected is exactly equal to k,

// find the height H at which every tree should be cut (all trees have to be cut at the same height).
//   If it is not possible then return -1 else return H.
    
    
    static int find_height(int tree[], int n, int k)
    {
      Arrays.sort(tree);
int low = 0;
int high = tree[n - 1];
int ans = 0;
while (low <= high) {
ans = 0;
int mid = (low + high) / 2;

for (int i = 0; i < n; i++) {
if (tree[i] > mid)
ans += tree[i] - mid;
}

if (ans == k)
return mid;
else if (ans > k) {
low = mid + 1;
}
else
high = mid - 1;
}
return -1;
    }
}
