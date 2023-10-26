class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = false;
        char[] cArray = code.toCharArray();

        for(int i = 0; i<code.length(); i++) {
            if(mode) {
                 if('1' == cArray[i]) {
                    mode = false;
                } else {
                    answer += (i % 2 == 0) ? "" : cArray[i];
                }
             } else {
                if('1' == cArray[i]) {
                    mode = true;
                 } else {
                    answer += (i % 2 == 0) ? cArray[i] : "";
                }
            }
        }

       if("".equals(answer)) {
         answer = "EMPTY";
       }
        return answer;  
    }
}