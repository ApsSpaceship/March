package study_0329;

import java.util.Scanner;

public class baekjoon_P2839_설탕배달 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sugar = sc.nextInt();
		int n = sugar / 5; // 5kg 설탕 봉지 수
		int m = sugar % 5; 
		int ans = -1;
		// 만약 5로 나눈 나머지가 3으로 나누어 떨어지면 그 몫이 3키로 설탕봉지 수
		if( m % 3 == 0) {
			ans = n + (m/3);
		}else {
			while(n > 0) {
				n = n-1; // 5키로 설탕 봉지수 -1
				m = m + 5; // 설탕 5키로 더 남음
				if(m % 3 == 0) {
					ans = n + (m/3);
					break;
				}
			}
		}
		
		System.out.println(ans);
		
	}

}
