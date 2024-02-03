class Solution {
    public int solution(int n) {
        int answer = n % 7 == 0 ? n / 7 : n / 7 + 1;
        return answer;
    }

    // 타인 풀이 참고
    // return (n+6) / 7;
    // 6은 어떤 수를 7로 나누면 나머지가 0부터 6까지만 존재.
}
