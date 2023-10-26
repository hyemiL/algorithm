class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int temp = 0;
        for(int[] arr2 : queries) {
          int i = arr2[0];
          int j = arr2[1];

          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }

        return arr;
    }
}