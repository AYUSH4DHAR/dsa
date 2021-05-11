// public int[][] merge(int[][] intervals) {
//         if(intervals == null || intervals.length == 0){
//             return new int[0][];
//         }
// 		// seperate start and end 
//         int[] start = new int[intervals.length];
//         int[] end = new int[intervals.length];
//         List<int[]> res = new LinkedList<>();
//         for(int i = 0; i < intervals.length; i++){
//             start[i] = intervals[i][0];
//             end[i] = intervals[i][1];
//         }
		
// 		// sort start[] end[] respectively
//         Arrays.sort(start);
//         Arrays.sort(end);
		
//         int j = 0; // start time
//         for(int i = 0; i < intervals.length - 1; i++) { // iterate end time
//             if(start[i + 1] > end[i]) { // when collapse appears
//                 res.add(new int[] {start[j], end[i]}); // record
//                 j = i + 1; // move previous start time 
//             }    
//         }
//         res.add(new int[] {start[j], end[intervals.length - 1]}); // add last one
//         return res.toArray(new int[res.size()][]);
//     }
 public List<Interval> merge(List<Interval> intervals) {
            List<Interval> res = new LinkedList<Interval>();
            if(intervals.size()<2) return intervals;
//             Collections.sort(intervals, new Comparator<Interval>() {
//             @Override
//                 public int compare(Interval o1, Interval o2) {
//                     return o1.start-o2.start;
//                 }
//             });
	 
	   Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
	   Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
            Interval curr = intervals.get(0);
            for(Interval iter: intervals) {
                if(curr.end >= iter.start) {
                    curr.end = Math.max(curr.end,iter.end);
                }else {
                    res.add(curr);
                    curr = iter;
                }
            }
            res.add(curr);
            return res;
        }
    }
