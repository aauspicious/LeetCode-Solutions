class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Key = number, Value = its index in the array
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int match = target - nums[i]; // What number do we need?

            if (map.containsKey(match)) {
                // Found it! Return both indices
                return new int[]{map.get(match), i};
            } else {
                // Not found yet, store this number with its index
                map.put(nums[i], i);
            }
        }

        return new int[0]; // No solution found
    }
}