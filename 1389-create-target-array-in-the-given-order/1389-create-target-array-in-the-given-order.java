class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> eh = new ArrayList<>();
        int length = nums.length;
        int[] target = new int[length];
        
        for(int i = 0; i < length; i++)eh.add(index[i], nums[i]);
        for(int i=0;i<length;i++) target[i] = eh.get(i);
        return target;
    }
}