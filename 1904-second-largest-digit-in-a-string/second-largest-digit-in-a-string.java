class Solution {
    public int secondHighest(String s) {
        Set<Integer> result = new HashSet<>();
        for(int i=0;i<s.length();i++){
            int val = s.charAt(i) - '0';
            if(val >= 0 && val <= 9){
                result.add(val);
            }
        }
         int max1 = -1;
         int max2 = 0;
        for(int x : result){
           if(max1 < x){
             max2 = max1;
             max1 = x;
           } 
        }
        if(result.isEmpty()) return -1;
        return max2;
    }
}