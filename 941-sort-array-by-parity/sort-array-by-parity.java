class Solution {
    public int[] sortArrayByParity(int[] nums) 
    {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2 == 0)
            {
                even.add(nums[i]);
            }else
            {
                odd.add(nums[i]);
            }
        }
        int result[] = new int[nums.length];
        int i=0;
        for(int x : even)
        {
            result[i] = x;
            i++;
        }
         for(int x : odd)
        {
            result[i] = x; 
            i++;
        }
        return result;
    }
}