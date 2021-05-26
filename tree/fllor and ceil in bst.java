public void floorCeilBSTHelper(Node root,
                               int key)
{
    while (root != null)
    {
        if (root.data == key)
        {
            ceil = root.data;
            floor = root.data;
            return;
        }
 
        if (key > root.data)
        {
            floor = root.data;
            root = root.right;
        }
        else
        {
            ceil = root.data;
            root = root.left;
        }
    }
    return;
}
public void floorCeilBST(Node root, int key)
{
     
    // Variables 'floor' and 'ceil'
    // are passed by reference
    floor = -1;
    ceil = -1;
 
    floorCeilBSTHelper(root, key);
 
    System.out.println(key + " " +
                     floor + " " + ceil);
}
