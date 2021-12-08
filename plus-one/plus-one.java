class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1] != 9){
            digits[digits.length-1]++;
            return digits;
        }
        else{
            int i = digits.length-1;
            while(i>=0 && digits[i] +1 >= 10){
                digits[i] = 0;
                i--;
            }
            
            if(i == -1){
                int[] newDigits = new int[digits.length+1];
                for(int j = digits.length-1; i >=0; i--) newDigits[j+1] = digits[j]; 
                newDigits[0] = 1;
                return newDigits;
            }else digits[i]++;
        }
        return digits;
    }
}
