package Study_20220311_17;

import java.util.Scanner;

public class BOJ_2231_분해합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int nLength = N.length();
		int ans = 0; //답은 0으로 초기화
		int n = Integer.parseInt(N);
		
		//생성자는 n-(맨앞자릿수 + 9*나머지길이)보다 작을 수 없음
		int con = n - (N.charAt(0) - '0') - 9 * (nLength - 1);
		while (con < n) {
			int sum = con; //합은 이번 생성자로 초기화
			int sub = con;
			while (sub > 0) { //모든 자릿수 더하기
				sum += sub % 10;
				sub /= 10;
			}
			if (sum == n) { //생성자를 찾았다면
				ans = con;
				break;
			}
			con++;
		}
		System.out.print(ans);
	}

}
