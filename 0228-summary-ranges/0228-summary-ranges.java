class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        List<String> res = new ArrayList<>(n);
        int min_value = Integer.MIN_VALUE, max_value = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            min_value = nums[i];
            max_value = nums[i];

            while (i < n - 1 && nums[i+1] == nums[i] + 1) {
                i++;
                max_value = nums[i];
            }

            if (min_value == max_value) {
                res.add(String.valueOf(min_value));
            } else {
                String interval = min_value + "->" + max_value;
                res.add(interval);
            }
        }

        return res;
    }
}