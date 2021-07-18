 static int PositionRightmostSetbit(int n)
    {
        // Position variable initialize
        // with 1 m variable is used to
        // check the set bit
        int position = 1;
        int m = 1;
 
        while ((n & m) == 0) {
 
            // left shift
            m = m << 1;
            position++;
        }
        return position;
    }
