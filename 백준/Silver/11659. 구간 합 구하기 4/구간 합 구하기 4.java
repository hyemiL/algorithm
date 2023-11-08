import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int suNo = Integer.parseInt(st.nextToken());
    int quizNo = Integer.parseInt(st.nextToken());

    long[] sArr = new long[suNo + 1]; // 0번째 수를 신경쓰지 않기 위한 조치
    st = new StringTokenizer(br.readLine());

    for (int i = 1; i <= suNo; i++) {
      sArr[i] = sArr[i-1] + Integer.parseInt(st.nextToken());
    }

    for(int q = 0; q < quizNo; q++) {
      st = new StringTokenizer(br.readLine());
      int i = Integer.parseInt(st.nextToken());
      int j = Integer.parseInt(st.nextToken());
      System.out.println(sArr[j] - sArr[i-1]);
    }
  }
}