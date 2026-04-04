class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int n : nums){
            st.add(n);
        }
        int maxi = 0;
        for(int i : st){
            if(!st.contains(i-1)){
                int num = i;
                int count = 1;
                while(st.contains(num+1)){
                    num++;
                    count++;
                }
                maxi = Math.max(maxi, count);
                count = 0;
            }
        }
        return maxi;
    }
}
