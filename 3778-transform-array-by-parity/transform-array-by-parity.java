class Solution {
    public int[] transformArray(int[] nums) 
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2 == 0) 
            {
                nums[i] = 0;
            }else{
                nums[i]=1;
            }
        } int zero=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 0) zero++;
        }
        for(int i=0;i<nums.length;i++)
        {
           if(zero > 0) {nums[i] = 0;zero--;}
           else {nums[i] = 1;}
        }
        return nums;
    }
}