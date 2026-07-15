class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        int len  = nums.length;
        for(int i = 0; i < len ; i++){
            if(mp.containsKey(target-nums[i])){
                return new int[]{mp.get(target-nums[i]), i};
            }else mp.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
