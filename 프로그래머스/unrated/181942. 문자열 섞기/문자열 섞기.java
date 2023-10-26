class Solution {
    public String solution(String str1, String str2) {
        String answer = "";

        char[] c = str1.toCharArray();
        char[] c2 = str2.toCharArray();

        for(int i = 0; i < c.length; i++) {
          answer += c[i];
          answer += c2[i];
        }

    return answer;
    }
}