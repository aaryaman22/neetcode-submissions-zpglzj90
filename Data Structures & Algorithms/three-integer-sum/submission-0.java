class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        for(int i = 0 ; i < len ; i++){

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i+1;
            int k = len-1;

            while(j < k){

                int sum = nums[i] + nums[j] + nums[k]; 
 
                if(sum == 0){

                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    while(j < k && nums[j]==nums[j+1])j+=1;
                    while(j < k && nums[k]==nums[k-1])k-=1;

                    j++;
                    k--;
                }
                else if(nums[i] + nums[j] + nums[k] < 0){
                    j++;
                }else{
                    k--;
                } 
            }
        }
        return ans;
    }
}
