class Solution {
    public int maxArea(int[] height) 
    {   int start=0, end=height.length-1;
        int maximum = 0;
        while(start < end)
        {   int length1 = Math.abs(start-end);
            int area = length1* Math.min(height[start],height[end]);
            maximum = Math.max(maximum,area);
           if(height[start] < height[end]) start++;
           else end--;
        }
        return maximum;
    }
}