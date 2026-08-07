class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) return 1;  // special case

        int mask = 1;
        while (mask <= n) {
            mask = mask << 1;  
        }

        return (mask - 1) ^ n;
    }
}
