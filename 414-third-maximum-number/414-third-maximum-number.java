class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        Set<Integer> set = new HashSet<>();
        
        for(int num: nums) set.add(num);
        for(Integer number : set) pQ.add(number);
        
        if(pQ.size() < 3) return pQ.poll();
        pQ.poll(); 
        pQ.poll(); 
        
        return pQ.poll();
    }
}