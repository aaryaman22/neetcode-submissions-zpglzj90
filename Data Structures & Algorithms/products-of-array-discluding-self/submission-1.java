class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] suf = new int[len];
        int[] pre = new int[len];
        pre[len-1] = 1;
        suf[0] = 1;
        int i = 1;
        while(i < len){
            suf[i] = nums[i-1]*suf[i-1];

            pre[len-1-i] = nums[len-i] * pre[len-i];

            i++;
        }

        int [] ans = new int[len];
        for(int k = 0 ; k < len ; k++){
            ans[k] = pre[k]*suf[k];
        }
        return ans;
    }
}  
