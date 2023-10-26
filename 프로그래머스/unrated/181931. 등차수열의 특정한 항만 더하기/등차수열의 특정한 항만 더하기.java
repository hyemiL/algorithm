class Solution {
    public int solution(int a, int d, boolean[] included) {
        int cnt = 0;
        int answer = 0;
        for(boolean b : included) {
          if(b) { answer += a + (cnt * d); }
          cnt++;
        }
        return answer;
    }
}