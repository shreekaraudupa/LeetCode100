class Solution {
    public boolean isPalindrome(String s) {
        String realString = "";
        
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                realString += c;
            }
        }
        
        int start = 0;
        int end = realString.length() -1;
        
        realString = realString.toLowerCase();
        
        while (start < end) {
            if(realString.charAt(start) != realString.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}