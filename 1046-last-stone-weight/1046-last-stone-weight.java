class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1) return stones[0];
        Arrays.sort(stones);
        
        int rp = stones.length-1;
        int lp = rp-1;
        
        while(rp > 0){
            if(stones[rp]<stones[lp]) Arrays.sort(stones); 
            if(stones[rp]-stones[lp]!=0){
                stones[lp] = stones[rp]-stones[lp];
                lp--;
                rp--;  
            }else{
                lp-=2;
                rp-=2;
            }
        }
        return (lp == -2) ? 0 : stones[0];
    }
}