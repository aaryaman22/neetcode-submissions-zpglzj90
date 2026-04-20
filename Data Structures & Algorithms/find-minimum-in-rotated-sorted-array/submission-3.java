class Solution {
    public int findMin(int[] nums) {
        int len = nums.length;
        int l = 0;
        int r = len-1;
        while(l < r){
            int mid = (l+r)/2;
            if(l==r)return -1;
            if(nums[mid] < nums[l]){
                r = mid;
            }else{
                if(nums[r] < nums[mid]){
                    l = mid+1;
                }
                else{
                    r = mid;
                }
            }
        }
        return nums[r];
    }
}
