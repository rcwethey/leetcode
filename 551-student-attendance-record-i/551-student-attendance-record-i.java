class Solution {
    public boolean checkRecord(String s) {
        if(s.length() < 2) return true;
        
        int absence = 0, latesInARow = 0;
        
        for(char attendenceCheck: s.toCharArray()){
            if(attendenceCheck == 'A'){
                absence++;
                latesInARow = 0;
            }
            if(attendenceCheck == 'L'){
                latesInARow++;
            }
            if(attendenceCheck == 'P'){
                latesInARow = 0;
            }
            if(absence > 1 || latesInARow > 2) return false;
        }
        
        //if(latesInARow > maxLate) maxLate = latesInARow;
        return true;
    }
}