class Solution {
    public int maxProfit(int[] prices) {
        int buying=prices[0];
        int profit= 0;
        int n= prices.length;
        for(int i=1;i<n;i++){
            if(buying > prices[i]){
                buying = prices[i];
            }
            profit= Math.max(profit, prices[i]-buying);
        }
        return profit;
    }
}