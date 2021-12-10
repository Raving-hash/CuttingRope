class Solution {
        public int cuttingRope(int n) {
            if(n <= 3) return n - 1;
            if(n == 4) return n;
            int p = 1000000007;
            long res = 1;
            while (n > 4){
                res = res * 3 % p;
                n -= 3;
            }
            return (int)(res * n % p);
        }

    public static void main(String[] args) {
        Solution s = new Solution();
        int i = s.cuttingRope(115);
        System.out.println("i = " + i);
    }
}

