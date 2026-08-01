class Solution {
    public int searchInsert(int[] nums, int target) 
    {    
        if(nums.length == 1)
        {
            if(nums[0] == target) return 0;
            else if(target < nums[0]) return 0;
            else if(target > nums[0]) return 1;
        }
        if(target < nums[0] ) return 0;
         for(int i=0;i<nums.length;i++)
         {
            if(nums[i] == target) return i;
         }
        
         for(int i=0,j=1;j<nums.length;i++,j++)
         {
            if(target > nums[i] && target < nums[j]) return j;
         }

         return nums.length;
    }
}