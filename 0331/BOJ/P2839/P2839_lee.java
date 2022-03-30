import java.util.Scanner;

public class P2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int q= N/5;
		int r= N%5;
		// 나누어 떨어지지 않을 때 -1 반환
		int ans = -1;
		// 5로 나눈 나머지가 3으로 나누어 떨어질 경우 
		if(r%3 == 0) {
			ans = q+r/3;
		}else {
			//  5로 나눈 나머지가 3으로 나누어 떨어지지 않을 경우
			while(true) {
				// 나머지가 3으로 나누어 떨어질 경우 
				if(r%3 == 0) {
					ans = q + r/3;
					break;
				}
				// 5kg 짜리 설탕봉지는 0개가 되었는데, N이 3으로 나누어 떨어지지 않을 때, 멈춤
				if(q==0 && r%3 != 0) break;
				// 5kg 짜리봉지 개수 -1 
				q--;
				// 나머지 무게에 5kg 더해주기
				r += 5;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
