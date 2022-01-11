class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int length = nums.length;
        Integer[] target = new Integer[length];
        for(int i = 0; i< length; i++){
            if(target[index[i]] == null) target[index[i]] = nums[i];
            else{
                for(int k = length-1; k >index[i]; k--)target[k]= target[k-1];
                target[index[i]] = nums[i];
            }
        }
        int[] intArray = Arrays.stream(target).mapToInt(Integer::intValue).toArray();
        return intArray;
    }
}