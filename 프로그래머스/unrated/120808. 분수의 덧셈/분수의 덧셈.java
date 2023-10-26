class Solution {
    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numerNew = numer1 * denom2 + numer2 * denom1;
        int denomNew = denom1 * denom2;
        int gcdValue = gcd(numerNew, denomNew);
        
         return new int[]{numerNew / gcdValue, denomNew / gcdValue};
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
          int temp = b;
          b = a % b;
          a = temp;
        }
        return a;
    }
}