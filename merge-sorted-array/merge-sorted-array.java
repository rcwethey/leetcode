class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2.length == 0) return;
        int nums1RLength = nums1.length-1;
        if(nums1.length == 1 && m == 0) m++;
        int dec = 0;
        
        
        while(n-1 >= 0 && m-1 >= 0){
            
            for(int val: nums1) System.out.print(val + ", ");
            System.out.println();
            for(int val: nums2) System.out.print(val + ", ");
            System.out.println();
        
            
            if(nums1[m-1] >= nums2[n-1]){
                int swappedVal = nums1[nums1RLength-dec];
                
                nums1[nums1RLength-dec] = nums1[m-1];
                nums1[m-1] = swappedVal;
                m--;
            }else{
                nums1[nums1RLength-dec] = nums2[n-1];
                n--;
            }
            dec++;
        }
        
        
        while(n-1 >= 0 && (nums1RLength-dec) >=0){
            for(int val: nums1) System.out.print(val + ", ");
            System.out.println();
            for(int val: nums2) System.out.print(val + ", ");
            System.out.println();
            
            nums1[nums1RLength-dec] = nums2[n-1];
            n--;
            dec++;
        }
        
        
        while(m-1 >= 0 && (nums1RLength-dec) >=0){
            for(int val: nums1) System.out.print(val + ", ");
            System.out.println();
            for(int val: nums2) System.out.print(val + ", ");
            System.out.println();
            
            nums1[nums1RLength-dec] = nums1[m-1];
            m--;
            dec++;
        }
    }
}