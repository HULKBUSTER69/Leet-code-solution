class Solution {
    public int[][] generateMatrix(int n) 
    {  int result[][] = new int[n][n];
       int left =0, right = result[0].length-1;
       int top =0, bottom = result.length-1;
       int num=1;
       
       while(top <= bottom && left <= right)
       {
           //left to right
           for(int i=left;i<=right;i++)
           {
            result[top][i] = num;
            num++;
           }top++;

           //top to bottom
            for(int i=top;i<=bottom;i++)
           {
            result[i][right] = num;
            num++;
           }right--;
           
           //right to left
           if(top <= bottom)
            for(int i=right;i>=left;i--)
           {
            result[bottom][i] = num;
            num++;
           }bottom--;

           //bottom to top
           if(left <= right)
            for(int i=bottom;i>=top;i--)
           {
            result[i][left] = num;
            num++;
           }left++;
       }
        return result;
    }
}