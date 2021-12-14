class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int min = 0;
        int sum = -1;
        int max = numbers.length-1;
        
        while(sum != target){
            System.out.println("Min: " + min + ", Max : " + max);
            sum = (numbers[min] + numbers[max]);
            if(sum < target) min++;
            if(sum > target) max--;
        }
        
        int[] solutionArray = new int[2];
        solutionArray[0] = min+1;
        solutionArray[1] = max+1;        
        return solutionArray;
    }
}