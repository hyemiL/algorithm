import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
            StringBuffer sb = new StringBuffer();

    for(int i=0; i<a.length(); i++) {
      int origin = a.charAt(i);
      if(65<=origin && origin <=90) {
        sb.append((char)(origin+32));
      } else if(97<=origin && origin <=122) {
        sb.append((char)(origin-32));
      }
    }
    System.out.println(sb);
    }
}