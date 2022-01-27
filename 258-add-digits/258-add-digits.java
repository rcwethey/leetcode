class Solution {
    public int addDigits(int num) {
        while(Integer.toString(num).length() > 1){
        //while(num > 9){
            int total = 0;
            //total = num%10; <- This gets the last digit in a base-10 number
            //num = num/10; <- This removes the last digit in a base-10 number
            char[] numCharArray = Integer.toString(num).toCharArray();
            for(char charNum : numCharArray) total+= charNum -'0';
            num = total;
        }
        return num;
    }
}