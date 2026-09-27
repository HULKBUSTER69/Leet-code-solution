class Solution {
    public int[] shuffle(int[] nums, int n) 
    {
        int arr[] = new int[nums.length];
        int x=0,y=n;
        for(int i=0;i<nums.length-1;i+=2)
        {
            arr[i] = nums[x];
            arr[i+1] = nums[y];
            x++;y++;
        }
        return arr;
    }
}