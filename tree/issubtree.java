  public boolean isSubtree(TreeNode s, TreeNode t) { // takes O(m x n)
  if (s == null) {
    return t == null;
  }
  return isSame(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
}

private boolean isSame(TreeNode t1, TreeNode t2) { // takes O(n)
  if (t1 == null && t2 == null) return true;
  if (t1 == null || t2 == null) return false;
  
  if (t1.val != t2.val) return false;
  return isSame(t1.left, t2.left) && isSame(t1.right, t2.right);
}
  




//////////////////////////////////////////////////
*************************************************
////////////////////////////////////////////////////
public boolean isSubtree(TreeNode s, TreeNode t) {
  // s
  StringBuilder sb = new StringBuilder();
  preorder(s, sb);
  String seqS = sb.toString();
  // t
  sb = new StringBuilder();
  preorder(t, sb);
  String seqT = sb.toString();
  
  return seqS.indexOf(seqT) >= 0;
}

private void preorder(TreeNode t, StringBuilder sb) {
  if (t == null) {
    sb.append("null");
    return;
  }
  sb.append("#" + t.val);
  preorder(t.left, sb);
  preorder(t.right, sb);
}
