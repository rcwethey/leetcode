class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lp = 0, sum = Integer.MIN_VALUE, rp = numbers.length-1;
        
        while(sum != target){
            sum = numbers[lp] + numbers[rp];
            //System.out.println(sum + " : min: "+ min + ", max: " + max);
            if(sum < target) lp++;
            if(sum > target) rp--;
        }
        
        return new int[]{lp+1, rp+1};
    }
}