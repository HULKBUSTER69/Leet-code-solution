class Solution {
    public boolean isTrionic(int[] nums) 
    {   if(nums.length < 4) return false;
        int start =0, next =1;
        int count1=0,count2=0;
        while(nums[start] < nums[next])
        {
            start++;next++;count1++;
            if(next == nums.length) return false;
        } if(count1 ==0) return false;
        while(nums[start] > nums[next])
        {
            start++;next++;count2++;
            if(next == nums.length) return false;
        }if(count2 == 0) return false;
         while(nums[start] < nums[next])
        {
            start++;next++;
            if(next == nums.length) return true;
        }
        return false;
    }
}