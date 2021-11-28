class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romansMap = new HashMap<Character, Integer>();
            romansMap.put('I', 1);
            romansMap.put('V', 5);
            romansMap.put('X', 10);
            romansMap.put('L', 50);
            romansMap.put('C', 100);
            romansMap.put('D', 500);
            romansMap.put('M', 1000);  
        int total = 0;
        char[] romanChars = s.toCharArray();
        
        for(int i = 0; i < romanChars.length; i++){
            if(i+1 < romanChars.length && romansMap.get(romanChars[i+1]) > romansMap.get(romanChars[i])){
                total += (romansMap.get(romanChars[i+1]) - romansMap.get(romanChars[i]));
                i++;
            }
            else{ 
                total += romansMap.get(romanChars[i]);
            }
            if(total < 0) total = Math.abs(total);
        }
        return total;
    }
    
}