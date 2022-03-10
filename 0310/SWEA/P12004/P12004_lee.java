import java.util.Scanner;

public class P12004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			// 수
			int num = sc.nextInt();
			boolean flag = false;
			int cnt = 1;
			// 1~9의 숫자로 다 나누어 본다.
			while(cnt != 10) {
				// 다 해보면 반복 중단
				if(cnt == 10) break;
				if(num / cnt < 10 && num % cnt == 0) {
					flag = true;
					break;
				}
				cnt++;
			}
			// 출력
			if(flag) System.out.println("#"+tc+" Yes");
			else  System.out.println("#"+tc+" No");
		}
		sc.close();
	}
}
