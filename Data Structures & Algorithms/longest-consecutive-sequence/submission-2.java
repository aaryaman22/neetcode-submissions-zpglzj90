class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int n : nums){
            st.add(n);
        }
        int max = 0;
        for (int i : st){
            if(!st.contains(i-1)){
                int num = 0;
                while(st.contains(i++)){
                    num+=1;
                }
                max = Math.max(max, num);
            }
        }
        return max;
    }
}
