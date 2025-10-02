class Solution {
    public int majorityElement(int[] nums) {
       if(nums.length == 1) return nums[0];
       
       int half = (nums.length)/2;

       for(int i = 0; i < nums.length; i++){
        int cnt = 1;
        for(int j = i+1; j < nums.length; j++){
            if(nums[i]==nums[j]){
                cnt++;
            }
            if(cnt>half){
                return nums[j];
            }
        }
       }
       return nums[0];
    }
}