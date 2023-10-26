class Solution {
    public int[] solution(int[] num_list) {
        int[] returnArr = new int[num_list.length+1];
        int n = num_list.length-1; // 마지막 번지수

        for(int i = 0; i < num_list.length; i++) {
          returnArr[i] = num_list[i];
        }

        if(num_list[n-1] < num_list[n]) {
          returnArr[n+1] = num_list[n] - num_list[n-1];
        } else {
          returnArr[n+1] = num_list[n] * 2;
        }
        
        return returnArr;
    }
}