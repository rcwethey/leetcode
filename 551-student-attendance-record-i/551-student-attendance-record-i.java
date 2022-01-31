class Solution {
    public boolean checkRecord(String s) {
        if(s.length() < 2) return true;
        
        int absence = 0, maxLate = 0, latesInARow = 0;
        boolean lateStreak = false;
        
        for(char attendenceCheck: s.toCharArray()){
            if(attendenceCheck == 'A') absence++;
            if(attendenceCheck == 'L'){
                lateStreak = true;
                latesInARow++;
            }
            if(attendenceCheck != 'L' && lateStreak){
                lateStreak = false;
                if(latesInARow > maxLate) maxLate = latesInARow;
                latesInARow = 0;
            }
            if(absence > 1 || latesInARow > 2) return false;
        }
        
        if(latesInARow > maxLate) maxLate = latesInARow;
        return (absence < 2 && maxLate < 3);
    }
}