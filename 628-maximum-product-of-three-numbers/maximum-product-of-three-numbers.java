class Solution {
    public int maximumProduct(int[] nums) {
        int maxEnd=0;
        int maxStart=0;
       if(nums.length > 2)
       { int size = nums.length-1;
         Arrays.sort(nums);
         maxEnd = nums[size-2] * nums[size-1] * nums[size];
         maxStart = nums[0] * nums[1] * nums[size];
       }
         if(maxStart < maxEnd) return maxEnd;
        return maxStart;
    }
}