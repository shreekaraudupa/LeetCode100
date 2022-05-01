/*As the character array inpput is given swap the first and last element and then keep moving the start and end pointer to the middle*/
class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        
        while(start < end){
            char tmp = s[start];
            s[start] = s[end];
            s[end] = tmp;
            
            start++;
            end--;
        }
    }
}