class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> newMap = new HashMap<>();
        
        for(int i=0; i<jewels.length(); i++){ newMap.put(jewels.charAt(i), 0); }
        
        for(int i=0; i<stones.length(); i++){
            if(newMap.containsKey(stones.charAt(i))){
                newMap.put(stones.charAt(i), newMap.get(stones.charAt(i))+1);
            }
        }
        
        int sum = 0;
        for(Integer num: newMap.values()) sum += num;
        return sum;
    }
}