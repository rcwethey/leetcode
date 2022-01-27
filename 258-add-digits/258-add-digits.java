class Solution {
    public int addDigits(int num) {
        while(Integer.toString(num).length() > 1){
            int total = 0;
            char[] numCharArray = Integer.toString(num).toCharArray();
            for(char charNum : numCharArray) total+= charNum -'0';
            num = total;
        }
        return num;
    }
}