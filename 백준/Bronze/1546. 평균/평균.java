import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); //시험을 본 과목의 개수

    long sum = 0;
    long max = 0;

    for(int i = 0; i < N; i++) {
      int temp = sc.nextInt(); //입력받은 성적
      if (temp > max) max = temp; //입력받은 성적의 값이 max값보다 크면 max값 교체
      sum += temp; //sum에 temp값 누적
    }
    //변환점수의 평균
    // (A / M * 100 + A / M * 100 + A / M * 100) / 3 = (A+B+C) * 100 / M / 3
    System.out.println(sum * 100.0 / max / N); 
  }
}