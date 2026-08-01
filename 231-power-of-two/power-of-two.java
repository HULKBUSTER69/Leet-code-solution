class Solution {
    public boolean isPowerOfTwo(int n) 
    {   int x=0; double power=0;
        while(power <= n)
        {
             power =Math.pow(2,x);x++;
             if(power == n) return true;
        }

        return false;
    }
}