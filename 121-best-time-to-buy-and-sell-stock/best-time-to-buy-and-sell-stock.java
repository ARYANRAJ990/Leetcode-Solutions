class Solution {
    public int maxProfit(int[] prices) {
     int mx= Integer.MAX_VALUE;
     int maxiii=0;
     for(int i=0;i<prices.length;i++) {
         if(mx<prices[i]) {
             int profit= prices[i]-mx;
             maxiii= Math.max(maxiii,profit);
            
         }
         else{
             mx = prices[i];
         }
     } 
     return maxiii;  
    }
}