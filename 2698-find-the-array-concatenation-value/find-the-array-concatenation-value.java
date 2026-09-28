class Solution {
    public long findTheArrayConcVal(int[] nums) 
    {
        long sum=0;
        int start=0,end = nums.length-1;
        while(start < end)
        {
            sum = sum + (Integer.parseInt(String.valueOf(nums[start]) + String.valueOf(nums[end])));
            start++;end--;
        }
        if(start == end)
        {
             sum = sum + (Integer.parseInt(String.valueOf(nums[start])));
        }
        return sum;
    }
}