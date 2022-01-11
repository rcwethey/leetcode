class Solution {
    public String restoreString(String s, int[] indices) {
        char[] strArr = new char[indices.length];
        for(int i = 0; i < indices.length; i++) strArr[indices[i]] = s.charAt(i);
        return new String(strArr);
    }
}