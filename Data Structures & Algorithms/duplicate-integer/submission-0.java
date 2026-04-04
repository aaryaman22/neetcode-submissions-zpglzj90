class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int x: nums){
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }
        for( int x : mp.keySet()){
            if(mp.get(x) > 1){
                return true;
            }
        }
        return false;
    }
}