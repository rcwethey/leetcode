class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() == 1 && word.charAt(0) - '0' <= 90) return true;
        if(word.length() == 1 && word.charAt(0) - '0' > 90) return false;
        
        
        boolean finalVerdict = true;
        char[] wordChar = word.toCharArray();
        //System.out.println(wordChar[1] + " : " + ('a' - '0'));
        boolean reaminingCharsLowerCase = (wordChar[0] - '0' > 42) ? true : false;
        
        if(reaminingCharsLowerCase == true){
            for(int i = 1; i < wordChar.length; i++) if(wordChar[i] - '0' < 49) finalVerdict = false;
        }else{
            int i = 2;
            boolean reaminingCharsLowerCase2 = (wordChar[1] - '0' > 42) ? true : false;
            boolean caseChange = reaminingCharsLowerCase2;
            while(i < wordChar.length && caseChange == reaminingCharsLowerCase2){
                if(wordChar[i] - '0' > 42) caseChange = true;
                else caseChange = false;
                i++;
            }
            //System.out.println(caseChange +", "+ reaminingCharsLowerCase2 + ", " + i + ", " + wordChar.length);
            if(caseChange != reaminingCharsLowerCase2) finalVerdict = false;
        }
        return finalVerdict;
    }
}