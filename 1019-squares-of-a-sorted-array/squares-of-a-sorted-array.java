class Solution {
    public int[] sortedSquares(int[] nums) 
    {
        int arr[] = new int[nums.length];
        int start=0,end=nums.length-1;
        while(start <= end)
        {
            arr[start] = (nums[start]*nums[start]);
             arr[end] = (nums[end]*nums[end]);
             start++;end--;
        } 
        Arrays.sort(arr);
        return arr;
    }
}