  int first = 0;
        int last = 0;

        long result = m[first];
        ArrayList<Integer> res = new ArrayList<Integer>();
        while (result != s) {
            if (result > s) {
                if (first == last) {
                    last++;
                    first++;
                    if (last >= n) break;
                    result = m[first];
                } else {
                    result -= m[first];
                    first++;
                }
            } else {
                last++;
                if (last < n) {
                    result += m[last];
                } else {
                    break;
                }
            }
        }

        if (result != s) {
            res.add(-1);
        } else {
            res.add(first + 1);
            res.add(last + 1);
            
        }
        return res;    
    }
