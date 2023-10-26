class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int multiple = 1;
    
        for(int i : num_list) {
          sum += i;
          multiple *= i;
        }

        return multiple < sum * sum ? 1 : 0;
    }
}