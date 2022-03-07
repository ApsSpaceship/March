import java.util.Scanner;

public class P1436 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 // N 번째를 의미하는 N 입력
		 int N = sc.nextInt();
		 // 1번째는 666이므로 0번째의 의미로 665로 초기화
		 int n = 665;
		 // 1번째까지 반복
		 while(N > 0) {
			 // N이 0이 되면 멈춘다.
			 if(N == 0) break;
			 // 1씩증가하며 확인
			 n++;
			 // 문자열로 변환하여 666을 연속으로 포함하고 있는지 확인
			 if(String.valueOf(n).contains("666")) {
				 // 포함하고 있으면 N 감소
				 N--;
			 }
		 }
		 // 출력
		 System.out.println(n);
		 sc.close();
	}

}
