import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); // 입력받은 정수 N
    int count = 1; //연속된 자연수의 합으로 N을 나타내는 가짓수
    int sIndex = 1; //시작 인덱스
    int eIndex = 1; //종료 인덱스
    int sum = 1; //자연수의 합

    while(eIndex != N) {
      if(sum == N) { //자연수의 합이 입력받은 정수 N과 같은 경우
        count++; //가짓수 추가
        eIndex++; //종료 인덱스 하나 뒤로 밀어주기
        sum += eIndex; //다음 확인을 위하여 자연수의 합에 종료 인덱스값 추가
      } else if(sum > N) { //자연수의 합이 입력받은 정수 N보다 큰 경우
        sum -= sIndex; //자연수의 합에서 시작 인덱스값 빼기
        sIndex++; //시작 인덱스 하나 뒤로 밀어주기
      } else { //자연수의 합이 입력받은 정수 N보다 작은 경우
        eIndex++; //종료 인덱스 하나 뒤로 밀어주기
        sum += eIndex; //자연수의 합에 종료 인덱스값 추가
      }
    }
    System.out.println(count);
  }
}