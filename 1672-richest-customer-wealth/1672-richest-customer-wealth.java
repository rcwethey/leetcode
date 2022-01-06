class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = -1;
        for(int i = 0; i< accounts.length; i++){
            int accountLength = accounts[i].length;
            int wealth = 0;
            for(int j = 0; j < accountLength; j++) wealth += accounts[i][j];
            if(wealth > maxWealth) maxWealth = wealth;
        }
        return maxWealth;
    }
}