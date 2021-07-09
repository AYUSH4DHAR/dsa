An Efficient solution based on tree serialization and hashing. The idea is to serialize subtrees as strings and store the strings in hash table. 
  Once we find a serialized tree (which is not a leaf) already existing in hash-table, we return true. 

Below The implementation of above idea. 


// Java program to find if there is a duplicate
// sub-tree of size 2 or more.
import java.util.HashSet;
public class Main {
 
    static char MARKER = '$';
 
    // This function returns empty string if tree
    // contains a duplicate subtree of size 2 or more.
    public static String dupSubUtil(Node root, HashSet<String> subtrees)
    {
        String s = "";
     
        // If current node is NULL, return marker
        if (root == null)
            return s + MARKER;
     
        // If left subtree has a duplicate subtree.
        String lStr = dupSubUtil(root.left,subtrees);
        if (lStr.equals(s))
            return s;
     
        // Do same for right subtree
        String rStr = dupSubUtil(root.right,subtrees);
        if (rStr.equals(s))
            return s;
     
        // Serialize current subtree
        s = s + root.data + lStr + rStr;
     
        // If current subtree already exists in hash
        // table. [Note that size of a serialized tree
        // with single node is 3 as it has two marker
        // nodes.
        if (s.length() > 3 && subtrees.contains(s))
            return "";
     
        subtrees.add(s);
        return s;
    }
  
  
  if s empty then retunr false else true;
