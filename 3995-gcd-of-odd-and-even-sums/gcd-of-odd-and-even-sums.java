class Solution {
    public int gcdOfOddEvenSums(int n) 
    {   int odd=0,even=0;
        for(int i=1;i<=n*2;i++)
        {
            if(i%2==0) even = even + i;
            else odd = odd + i;
        }
       
       for(int i=odd;i>0;i--)
       {
        if(odd%i==0 && even%i==0) return i;
       }

       return 0;
    }
}