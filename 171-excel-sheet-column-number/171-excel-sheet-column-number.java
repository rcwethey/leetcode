class Solution {
    public int titleToNumber(String columnTitle) {
        char[] columnTitleCharArray = columnTitle.toCharArray();
        int lengthOfArray = columnTitleCharArray.length-1;
        int sum = columnTitleCharArray[lengthOfArray]-64;
        for(int i = lengthOfArray-1; i>=0;i--){
            int asciiVal = columnTitleCharArray[i];
            int multiplier = (int)(Math.pow(26,lengthOfArray-i));
            sum +=  multiplier * (asciiVal - 64);
        }
        return sum;  
    }
}