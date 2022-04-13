class Solution {
    public int[] twoSum(int[] nums, int target) {
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
    }
}