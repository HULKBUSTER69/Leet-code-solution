class Solution {
    public int findGCD(int[] nums) 
    {  int min=nums[0],max=nums[0];
        for(int i=0;i<nums.length;i++)
        {  
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        int i=min;
             while(i <= min)
            {
            if( min%i==0 && max%i==0) return i;
            else i--;
            }
        
        return 1;
    }
}