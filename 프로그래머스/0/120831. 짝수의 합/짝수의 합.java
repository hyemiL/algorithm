class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++) {
            if(i%2 ==0) {
                answer += i;
            }
        }
        return answer;
    }

    // for문 안에서 if문으로 분기할 생각을 했는데 문제 자체가 짝수만 더하는 거니까 애초에 for문의 조건을 2부터 시작해서 +2씩 가면 굳이 다 돌 필요 없고 더 효율적이었겠다....!

    //타인 정답에서 배운 람다식
    //return IntStream.rangeClosed(0, n)
    //.filter(e -> e % 2 == 0)
    //.sum();
}
