
    public long toh(int N, int from, int to, int aux) {
        long moves = 0L;
        if (N >= 1) {
            // recursive call to move top disk from "from" to aux in current call
            moves += toh(N - 1, from, aux, to);
            System.out.println("move disk " + N + " from rod " + from +
                               " to rod " + to);
            
            // increment moves
            moves++;
            
            // recursive call to move top disk from aux to "to" in current call
            moves += toh(N - 1, aux, to, from);
        }
        return moves;
    }
