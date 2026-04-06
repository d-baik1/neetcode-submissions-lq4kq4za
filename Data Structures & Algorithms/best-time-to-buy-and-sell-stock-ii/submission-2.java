class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0; 

        for (int i = 0; i < prices.length; i++) {     
            if (prices[i] < minPrice)      
                minPrice = prices[i];       
            else if (prices[i] - minPrice > 0) {  
                maxProfit += prices[i] - minPrice; 
                minPrice = prices[i];
            }
        }
        return maxProfit;
    }
}