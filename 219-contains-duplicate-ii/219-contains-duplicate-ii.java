class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
            if(set.size() > k)
                set.remove(nums[i-k]);
        }
        return false;
        
        
        /*
        for(int i = 0; i< nums.length;i++){
            for(int j = i+1; j <nums.length && j<=(i+k); j++){
                //System.out.println(i+k + " : " + j);
                //if(nums[i] == nums[j]) System.out.println(Math.abs(i-j));
                if(nums[i] == nums[j] && Math.abs(i-j) <= k) return true;
            }
        }
        return false;
        */
    }
}