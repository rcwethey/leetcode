class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) 
            if(!set.add(num)) return true;
        return false;  
    }
    
}   
    
    
       
























/*
    Set<Integer> finalSet = new HashSet<>();

    //ArrayList<Integer> numsList = new ArrayList<>();
    //for(int el: nums) numsList.add(el);

    //finalSet.addAll(numsList);

    //if(finalSet.size() != nums.length) return true;

    for(int el: nums){
        if(finalSet.contains(el)) return true;
        finalSet.add(el);
    }

    return false;
*/
