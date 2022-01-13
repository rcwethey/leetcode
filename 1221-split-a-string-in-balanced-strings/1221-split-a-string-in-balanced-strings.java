class Solution {
    public int balancedStringSplit(String s) {
        int sum = 0, count = 0;
        for(int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            if(current == 'R') count++;
            else count--;
            if(count == 0) sum++;
        }
        
        return sum;
    }
}