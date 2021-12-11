class Solution {
    public String addBinary(String a, String b) {
        int longest = a.length() < b.length() ? b.length() : a.length();
        int Alength = a.length()-1, Blength = b.length()-1;
        ArrayDeque<Integer> theStack = new ArrayDeque<Integer>();
        
        int carryover = 0;
        while(Alength >= 0 && Blength >= 0){
            Integer thang = Integer.parseInt(a.substring(Alength, Alength+1)) + Integer.parseInt(b.substring(Blength, Blength+1)) + carryover;
            if(thang == 3) theStack.addFirst(1);
            else if(thang == 2){
                theStack.addFirst(0);
                carryover=1;
            }else if(thang == 1){
                theStack.addFirst(1);
                carryover=0;
            }else{
                theStack.addFirst(0);
                carryover=0;  
            }
            
            Alength--;
            Blength--;
        }
        
        while(Alength >= 0){
            Integer thang = Integer.parseInt(a.substring(Alength, Alength+1)) + carryover;
            if(thang == 3) theStack.addFirst(1);
            else if(thang == 2){
                theStack.addFirst(0);
                carryover=1;
            }else if(thang == 1){
                theStack.addFirst(1);
                carryover=0;
            }else{
                theStack.addFirst(0);
                carryover=0;  
            }
            
            Alength--;
        }
        
        while(Blength >= 0){
            Integer thang = Integer.parseInt(b.substring(Blength, Blength+1)) + carryover;
            if(thang == 3) theStack.addFirst(1);
            else if(thang == 2){
                theStack.addFirst(0);
                carryover=1;
            }else if(thang == 1){
                theStack.addFirst(1);
                carryover=0;
            }else{
                theStack.addFirst(0);
                carryover=0;  
            }
            Blength--;
        }
        
        if(carryover == 1){
            theStack.addFirst(1);
            longest++;
        }
        
        StringBuilder newString = new StringBuilder(longest);
        
        Iterator value = theStack.iterator();
        while(value.hasNext()) newString.append(value.next());
        
        return newString.toString();
    }
}