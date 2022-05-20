class Solution {
    public List<String> generateParenthesis(int n) {
        //Result list
        List<String> result = new ArrayList<>();
        generateParenthesisHelper(0,0,"",n,result);
        return result;
    }
    
    public void generateParenthesisHelper(int open,int close,String s,int n,List<String> result){
        
        //Base case to exist the recursion
        if(open == n && close ==n){
            result.add(s);
            return;
        }
        
        //if the number of paranthesis is less than the given n
        if(open < n){
            generateParenthesisHelper(open+1,close,s + "(",n,result);
        }
  
        //Close paranthesis to balance the open 
        if(close < open){
            generateParenthesisHelper(open,close+1,s + ")",n,result);
        }
        
    }
}