static boolean RootToNode(node root, int key,
                            Vector<Integer> v)
{
    if (root == null)
        return false;
  
    // Add current node to the path
    v.add(root.data);
  
    // If current node is the target node
    if (root.data == key)
        return true;
  
    // If the target node exists in
    // the left or the right sub-tree
    if (RootToNode(root.left, key, v)
        || RootToNode(root.right, key, v))
        return true;
  
    // Remove the last inserted node as
    // it is not a part of the path
    // from root to target
    v.removeElementAt(v.size()-1);
    return false;
}
maint(){
  
  Vector<Integer> v = new Vector<>();
  
    // Find the path from root to the target node
    RootToNode(root, target, v)
 if (k > v.size() - 1 || k <= 0)
        System.out.println(-1);
    else
        System.out.println(v.get(v.size() - 1 - k));
}
