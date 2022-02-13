class Solution {
        
    //[2,1,4]
    public int maxProfit(int[] prices) {
        int profit=0;
        int min=Integer.MAX_VALUE;
        for(int price : prices){
            //Same thing as saying -> if(price < min) min = price; 
            min=Math.min(min,price);
            
            //Same thing as saying -> if(price-min > profit) profit = price-min; 
            profit=Math.max(profit,price-min);
         }

        return profit;
    }
    
    /* 
    
    ---WORKING SOLUTION---
    
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
        
    /*
    
    ---NON WORKING SOLUTION---
    
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