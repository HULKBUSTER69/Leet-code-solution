class Solution {
    public int[] concatWithReverse(int[] nums) 
    {
        int size = nums.length;
        int arr[] = new int[2*size];
        int start=0,end = arr.length-1;int i=0;
        while(start<end)
        {
            arr[start] = nums[i];
            arr[end] = nums[i];
            i++;
            start++;end--;
        }  

        return arr;      
    }
}