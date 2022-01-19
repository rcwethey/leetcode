class Solution {
    public char findTheDifference(String s, String t) {
        /*
        I could have thought about the Strings as possible totals becuase each character has a value
        and the difference of both sums then set to a char would hace given me the char added.
        
        But I will leave this answer because this is how I got it without the help of anyone else.
        */
        
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        char theChar = ' ';
        
        for(int i = 0; i<s.length(); i++){
            if(sMap.containsKey(s.charAt(i))) sMap.put(s.charAt(i), sMap.get(s.charAt(i))+1);
            else sMap.put(s.charAt(i), 0);
            
            if(tMap.containsKey(t.charAt(i))) tMap.put(t.charAt(i), tMap.get(t.charAt(i))+1);
            else tMap.put(t.charAt(i), 0);
        }
        
        if(tMap.containsKey(t.charAt(t.length()-1))) tMap.put(t.charAt(t.length()-1), tMap.get(t.charAt(t.length()-1))+1);
        else tMap.put(t.charAt(t.length()-1), 0);
        
        for(Character c: tMap.keySet()) if(!sMap.containsKey(c) || tMap.get(c) != sMap.get(c)) theChar = c;
        
        return theChar;
    }
}