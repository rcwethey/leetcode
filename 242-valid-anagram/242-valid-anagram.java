class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> tMap = new HashMap<>();
        Map<Character, Integer> sMap = new HashMap<>();
        
        for(char char1 : t.toCharArray()) tMap.put(char1, tMap.getOrDefault(char1, 0)+1);
        for(char char2 : s.toCharArray()) sMap.put(char2, sMap.getOrDefault(char2,0)+1);
        //System.out.println(tMap.get('a') +" : "+ sMap.get('a'));
        
        return tMap.equals(sMap);
        //return false;
    }
}