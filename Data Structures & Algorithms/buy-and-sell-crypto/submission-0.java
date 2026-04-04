class Solution {
    public int maxProfit(int[] prices) {
        int low = prices[0];
        int maxProfit = 0;
        for(int x : prices){
            if(low >= x){
                low = x;
            }else{
                maxProfit = Math.max(maxProfit, x-low);
            }
        }
        return maxProfit;
    }
}
