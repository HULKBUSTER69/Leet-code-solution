class Solution {
    public boolean uniqueOccurrences(int[] arr) 
    {
        Map<Integer, Integer> result = new HashMap<>();
        Set<Integer> val = new HashSet<>();

        for(int x : arr){
            result.put(x , result.getOrDefault(x,0)+1);
        }
        for(Integer y : result.values())
        {
           if(!val.add(y)) return false;
        }
        return true;
    }
}