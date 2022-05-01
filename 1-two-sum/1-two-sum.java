class Solution {
    /*TC:- O(n) and SC:- O(n) */
    public int[] twoSum(int[] nums, int target) {
        // Array to store result
        int[] result = new int[2];
        // This map will store the difference and the corresponding index
        Map<Integer, Integer> map = new HashMap<>();
        // Loop through the entire array
        for (int i = 0; i < nums.length; i++) {
            // If we have seen the current element before
            // It means we have already encountered the other number of the pair
            if (map.containsKey(nums[i])) {
                // Index of the current element
                result[0] = i;
                // Index of the other element of the pair
                result[1] = map.get(nums[i]);
            }
            // If we have not seen the current before
            // It means we have not yet encountered any number of the pair
            else {
                // Save the difference of the target and the current element
                // with the index of the current element
                map.put(target - nums[i], i);
            }
        }
        return result;
        
        
        /* This is O(n2) time complexity
        int[] op = new int[2];
        for (int start = 0; start < nums.length; start++) {
            for (int i = start+1; i < nums.length; i++) {
                if ((nums[start] + nums[i]) == target) {
                    op[0] = start;
                    op[1] = i;
                    start = nums.length;
                    break;
                }
            }
        }
        return op;
        */
    }
}