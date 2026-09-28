class Solution {
    public int maxFrequencyElements(int[] nums) 
    {    int fre[] = new int[101];
    int max = 0;
    int max2 = nums[0];
    int sum=0;
         for(int i=0;i<nums.length;i++)
         {  max2 = Math.max(max2,nums[i]);
            fre[nums[i]]++;
            if(fre[nums[i]] > max)
            {
                max = fre[nums[i]];
            }
         }
         for(int i=0;i<=max2;i++)
         {
            if(fre[i] >= max)
            {
                sum = sum + fre[i];
            }
         }
         return sum;
    }
}