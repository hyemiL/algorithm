class Solution {
    public int solution(int angle) {
        int answer = 0;
        if(0 < angle && angle < 90) {
            answer = 1;
        } else if(90 == angle)  {
            answer = 2;
        } else if (90 < angle && angle < 180) {
            answer = 3;
        } else if (180 == angle) {
            answer = 4;
        } else {
            System.out.println("오류");
        }
        return answer;
    }
}