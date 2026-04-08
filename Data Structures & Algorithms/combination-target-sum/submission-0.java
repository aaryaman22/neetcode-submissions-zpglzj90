class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        bt(0, nums, target, new ArrayList<>(), ans);
        return ans;
    }


    private void bt(int index, int[]nums, int tar, List<Integer> li, List<List<Integer>> ans){
        if(tar==0){
            ans.add(new ArrayList(li));
            return;
        }
        if(index == nums.length || tar < 0)return;
        li.add(nums[index]);
        bt(index, nums, tar-nums[index], li, ans);
        li.remove(li.size()-1);
        bt(index+1, nums, tar, li, ans);
    }
}
