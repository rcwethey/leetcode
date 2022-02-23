class Solution {
    public int titleToNumber(String columnTitle) {
        int length = columnTitle.length()-1;
        int sum = columnTitle.charAt(length)-64;
        for(int i = length-1; i>=0;i--){
            int multiplier = (int)(Math.pow(26,length-i));
            sum +=  multiplier * (columnTitle.charAt(i) - 64);
        }
        return sum;  
    }
}