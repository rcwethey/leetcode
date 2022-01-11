class Solution {
    public String restoreString(String s, int[] indices) {
        char[] strArr = new char[indices.length];
        for(int i = 0; i < indices.length; i++) strArr[indices[i]] = s.charAt(i);
        String finalString = new String(strArr);
        return finalString;
    }
}