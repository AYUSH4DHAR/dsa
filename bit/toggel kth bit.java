Toggling k-th bit of a number


 static int toggleKthBit(int n, int k)
    {
        return (n ^ (1 << (k-1)));
    }
