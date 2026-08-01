class Solution {
    public List<Integer> spiralOrder(int[][] matrix) 
    {   List<Integer> result = new ArrayList<>();
        int left =0, right = matrix[0].length-1;
        int top=0, bottom = matrix.length-1;

        while(top <= bottom && left <= right)
        {
            // for left to right
            for(int i=left;i<=right;i++)
            {
                result.add(matrix[top][i]);
            }top++;

            // for top to bottom
            for(int j=top;j<=bottom;j++)
            {
                 result.add(matrix[j][right]);
            }right--;

            //for right to left
           if(top <= bottom)
           {
             for(int j=right;j>=left;j--)
            {
                 result.add(matrix[bottom][j]);
            }bottom--;
           }

            //for bottom to top
           if(left <= right)
           {
             for(int j=bottom;j>=top;j--)
            {
                 result.add(matrix[j][left]);
            }left++;
           }
        }
        return result;
    }
}