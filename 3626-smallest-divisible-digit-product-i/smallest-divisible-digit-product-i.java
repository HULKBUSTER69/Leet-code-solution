class Solution {
    public int smallestNumber(int n, int t) 
    {   int mul=1;
       for(int i=n;i>0;i= i/10)
          { 
            mul = mul*(i%10);
          }
       if(mul%t == 0 ) return n;
      
       return smallestNumber(n+1,t);
    }
}