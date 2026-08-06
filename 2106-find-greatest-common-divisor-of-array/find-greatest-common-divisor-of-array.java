class Solution {
    public int findGCD(int[] nums) 
    {
        Arrays.sort(nums);
        int end= nums.length-1;
        int i=nums[0];
        while(i <= nums[0])
        {
            if( nums[0]%i==0 && nums[end]%i==0) return i;
            else i--;
        }
        return 1;
    }
}