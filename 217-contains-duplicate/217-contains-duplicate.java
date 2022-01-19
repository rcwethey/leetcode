class Solution {
    public boolean containsDuplicate(int[] nums) {
        //Arrays.sort(nums);
        
        int n = nums.length;
        Set<Integer> finalSet = new HashSet<>();
        ArrayList<Integer> numsList = new ArrayList<>();
        for(int el: nums) numsList.add(el);
        finalSet.addAll(numsList);
        int m = finalSet.size();
        if(m != n) return true;
        return false;
        
        
        //List<Integer> finalList = new ArrayList<>();
        
        //for(int el: nums){
        //    if(finalList.contains(el)) return true;
        //    else finalList.add(el);
        //}
        
        //return false;
    }
}