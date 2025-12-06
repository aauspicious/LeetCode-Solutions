class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // avoid overflow

            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;      // go left
            } else {
                start = mid + 1;    // go right
            }
        }

        return -1; // not found
    }
}
