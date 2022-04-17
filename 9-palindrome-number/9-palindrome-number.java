class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 | (x!=0 && x % 10 ==0)) return false;
        
        int num = x;
        int y=0;
        
        while(num!=0){
            int rem = num % 10;
            num = num / 10;
            y = y*10 + rem;
        }
        
        return y == x;
        
    }
}