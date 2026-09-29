class Solution {
    public int search(int[] nums, int target) 
    {   if(nums.length == 1 && nums[0] == target) return 0;
        if(nums.length == 1 && nums[0] != target) return -1;
        int start =0,end = nums.length-1;
        while(start <= end)
        {
            if(nums[start] == target) return start;
            else if(nums[end] == target) return end;
            start++;end--;
        }
        return -1;
    }
}