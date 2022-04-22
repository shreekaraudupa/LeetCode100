class Solution {
        public int numJewelsInStones(String j, String s) {
        int count = 0;
        Set<Character> setA = new HashSet<>();

        for(char c : j.toCharArray()) setA.add(c);
        
        for(char c: s.toCharArray()){
            if (setA.contains(c)){
                count++;
            }
        }
        return count;
    }
}