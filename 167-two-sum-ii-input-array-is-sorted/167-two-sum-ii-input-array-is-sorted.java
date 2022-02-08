class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int min = 0, sum = Integer.MIN_VALUE, max = numbers.length-1;
        
        while(sum != target){
            sum = numbers[min] + numbers[max];
            //System.out.println(sum + " : min: "+ min + ", max: " + max);
            if(sum < target) min++;
            if(sum > target) max--;
        }
        
        return new int[]{min+1, max+1};
    }
}