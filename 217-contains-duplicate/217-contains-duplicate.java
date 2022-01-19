class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> finalSet = new HashSet<>();
        
        ArrayList<Integer> numsList = new ArrayList<>();
        for(int el: nums) numsList.add(el);
        
        finalSet.addAll(numsList);
        
        if(finalSet.size() != nums.length) return true;
        return false;
    }
}