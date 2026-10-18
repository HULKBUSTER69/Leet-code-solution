class Solution {
    public int[] findErrorNums(int[] nums) 
    {
        Set<Integer> set = new HashSet<>();
        int repeated=0;
        int num=0;
        int total=0;
        for(int i=0;i<nums.length;i++)
        {   total += i+1;
            if(set.add(nums[i])){
               num = num + nums[i];
            }else{
                 repeated = nums[i];
            }
        }
        
        return new int[]{repeated, (total-num)};
    }
}