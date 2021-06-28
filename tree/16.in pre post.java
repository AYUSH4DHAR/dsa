
/////////////////////////////////////////////////////////////////
Node root;
    void inorder()
    {
        if (root == null)
            return;
 
 
        Stack<Node> s = new Stack<Node>();
        Node curr = root;
 
        // traverse the tree
        while (curr != null || s.size() > 0)
        {
 
            /* Reach the left most Node of the
            curr Node */
            while (curr !=  null)
            {
                /* place pointer to a tree node on
                   the stack before traversing
                  the node's left subtree */
                s.push(curr);
                curr = curr.left;
            }
 
            /* Current must be NULL at this point */
            curr = s.pop();
 
            System.out.print(curr.data + " ");
 
            /* we have visited the node and its
               left subtree.  Now, it's right
               subtree's turn */
            curr = curr.right;
        }
    }
///////////////////////////////////////////////
  void iterativePreorder(Node node)
    {
 
        // Base Case
        if (node == null) {
            return;
        }
 
        // Create an empty stack and push root to it
        Stack<Node> nodeStack = new Stack<Node>();
        nodeStack.push(root);
 
        /* Pop all items one by one. Do following for every popped item
         a) print it
         b) push its right child
         c) push its left child
         Note that right child is pushed first so that left is processed first */
        while (nodeStack.empty() == false) {
 
            // Pop the top item from stack and print it
            Node mynode = nodeStack.peek();
            System.out.print(mynode.data + " ");
            nodeStack.pop();
 
            // Push right and left children of the popped node to stack
            if (mynode.right != null) {
                nodeStack.push(mynode.right);
            }
            if (mynode.left != null) {
                nodeStack.push(mynode.left);
            }
        }
    }
///////////////////////
static void postOrderIterative(node root)
    {
        // Create two stacks
        s1 = new Stack<>();
        s2 = new Stack<>();
  
        if (root == null)
            return;
  
        // push root to first stack
        s1.push(root);
  
        // Run while first stack is not empty
        while (!s1.isEmpty()) {
            // Pop an item from s1 and push it to s2
            node temp = s1.pop();
            s2.push(temp);
  
            // Push left and right children of
            // removed item to s1
            if (temp.left != null)
                s1.push(temp.left);
            if (temp.right != null)
                s1.push(temp.right);
        }
  
        // Print all elements of second stack
        while (!s2.isEmpty()) {
            node temp = s2.pop();
            System.out.print(temp.data + " ");
        }
    }
