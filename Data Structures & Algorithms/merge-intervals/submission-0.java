class Solution {
    public int[][] merge(int[][] intervals) {
         Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        List<int[]> ans = new ArrayList<>();
        int low = intervals[0][0];
        int high = intervals[0][1];
        int len = intervals.length;
        for(int i = 1 ; i < len ; i++){
            int i_low = intervals[i][0];
            if(i_low <= high){
                high = Math.max(high, intervals[i][1]);
            }
            else{
                ans.add(new int[]{low, high});
                low = i_low;
                high = intervals[i][1];
            }
        }
        ans.add(new int[]{low, high});
        return ans.toArray(new int[ans.size()][]);
    }
}
