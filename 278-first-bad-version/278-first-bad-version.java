/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n == 1) return 1;
        int lp = 0, rp = n;
        
        while(lp <= rp){
            int midPoint = lp + (rp - lp) / 2;
            if(isBadVersion(midPoint)) rp = midPoint -1;
            else lp = midPoint+1;
        }
        
        return lp;
    }
}