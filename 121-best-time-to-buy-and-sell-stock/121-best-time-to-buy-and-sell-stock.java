class Solution {
    /*
    public int maxProfit(int[] prices) {
        int lp = 0, rp = 1, max = 0;
       
        while(rp < prices.length){
            int difference = 0;
            if(prices[lp] >= prices[rp]){
                rp++;
                lp = rp-1;
            }else{
                difference = prices[rp] - prices[lp];
                rp++;
            }
            
            if(max < difference) max = difference;
        }
        
        return max;
    }
    */
        
    //[2,1,4]
    public int maxProfit(int[] prices) {
        int profit=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            profit=Math.max(profit,prices[i]-min);
         }

        return profit;
    }
        
        /*
        int max = 0, lp = 0, rp = prices.length-1;

        //[2,1,4]
        while(lp < rp){
            int difference = 0;
            if(prices[lp] > prices[rp]) lp++;
            else{
                difference = prices[rp] - prices[lp];
                rp--;
            }

            if(difference > max) max = difference;
        }

        return max;
        */
}