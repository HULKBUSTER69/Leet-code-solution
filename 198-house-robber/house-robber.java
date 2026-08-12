class Solution {
    public int rob(int[] nums) 
    {   if(nums.length == 1) return nums[0];
        int size = nums.length;
        int arr[] = new int[size];

        arr[0] = nums[0];
       if(size > 2)
       { arr[1] = Math.max(nums[0],nums[1]);}  
       else
       { return Math.max(nums[0],nums[1]);} 

       for(int i=2;i<size;i++)
       {
        arr[i] = Math.max((arr[i-2] + nums[i]) , arr[i-1]);
       } 

      return arr[arr.length-1];
    }
}