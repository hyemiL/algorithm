import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt(); //N값 입력받기
    String sNum = sc.next(); //길이 N의 숫자를 입력받아 String형 변수에 저장

    char[] cNum = sNum.toCharArray(); //sNum을 char 배열로 변환

    int sum = 0; //int형 변수 선언

    for(char c : cNum) {
      sum += c - '0'; //sum 함수에 char를 int로 변환해서 누적 합산
    }
    System.out.println(sum);

  }
}