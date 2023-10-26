class Solution {
    public int solution(int n, String control) {
        for(char c : control.toCharArray())  {
          int i = 0;
          switch (c) {
            case 'w' : i = 1; break;
            case 's' : i = -1; break;
            case 'd' : i = 10; break;
            case 'a' : i = -10; break;
          }
          n += i;
        }
    return n;
    }
}