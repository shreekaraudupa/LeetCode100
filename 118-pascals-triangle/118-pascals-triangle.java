class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();

        List<Integer> curr = new ArrayList<>();
        for(int i=0;i < numRows ; i++){
            curr.add(0,1);
            for(int x=1; x< curr.size()-1 ;x++){
                curr.set(x, curr.get(x)+curr.get(x+1));
            }
            output.add(new ArrayList<>(curr));
        }
        return output;
    }
}