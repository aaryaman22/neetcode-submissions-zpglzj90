class Solution {
    public int findMin(int[] nums) {
        int len = nums.length;
        int l = 0, r = len-1;
        while(l <= r){
            int m = (l+r)/2;
            if(l==r)return nums[l];
            if(nums[m] < nums[l]){
                r = m;
            }else{
                if(nums[m] > nums[r]){
                    l = m+1;
                }else{
                    r = m;
                }
            }
        }
        return -1;
    }
}
