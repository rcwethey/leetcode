class Solution {
    int rows = 0, coinsPerRow = 0;
    public int arrangeCoins(int n){  
        while(n > 0){
            coinsPerRow++;
            rows++;
            //System.out.println(coinsPerRow + ", n:" + n);
            n -= coinsPerRow;
        }
        if(n < 0) return rows-1;
        return rows;
    }
}