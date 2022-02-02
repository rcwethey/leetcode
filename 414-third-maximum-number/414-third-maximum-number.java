class Solution {
    public int thirdMax(int[] nums) {
        List<Integer> finalList = new ArrayList<>();
        
        for(int num: nums){
            if(!finalList.contains(num)) finalList.add(num);
        }
        
        //for (Integer ele : finalList) {
        //    System.out.println(ele);
        //}
        
        if(finalList.size() < 3 && finalList.size() > 1)
            return Math.max(finalList.get(0), finalList.get(1));
        else if(finalList.size() == 1) return finalList.get(0);
        
        Collections.sort(finalList, Collections.reverseOrder());
        
        return finalList.get(2);
    }
}