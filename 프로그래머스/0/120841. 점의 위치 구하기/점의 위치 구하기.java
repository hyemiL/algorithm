class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int x = dot[0];
        int y = dot[1];
        
        if(0 < x) {
            answer = 0 < y ? 1 : 4;
        } else if (0 > x) {
            answer = 0 < y ? 2 : 3;
        }
        
        return answer;
    }
}