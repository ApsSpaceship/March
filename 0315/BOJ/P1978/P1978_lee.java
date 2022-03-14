import java.util.Scanner;

public class P1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력받을 숫자 개수
		int N = sc.nextInt();
		// 소수 개수
		int cnt = 0;
		// 입력 받을 숫자 개수만큼 멈추지 않고 반복
		for(int i =0; i<N; i++) {
			// 입력 받기
			int num = sc.nextInt();
			// 소수 판별 flag
			boolean flag = true;
			// 2는 소수
			if(num == 2) {
				// 개수 추가
				cnt++;
				// 2보다 크고 해당 입력 받은 수보다 작은 모든 수로 나누어보고 나누어 떨어지는 경우 소수가 아니다.
 			}else if(num >2) {
				for(int j = 2; j < num; j++) {
					if(num % j == 0) {
						flag = false;
						break;
					}
				}
				// 소수 일때, 개수 추가
				if(flag) cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
