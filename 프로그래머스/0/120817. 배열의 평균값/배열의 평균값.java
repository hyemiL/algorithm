class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int i : numbers) {
            answer += i;
        }
        answer = answer / numbers.length;
        return answer;
    }

    // 다른 사람의 풀이 참고한 스트림 코드,,, 스트림 공부의 필요성 느낌
    // return Arrays.stream(numbers).average().orElse(0);
}
