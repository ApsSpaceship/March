package Study_20220311_17;

import java.util.Scanner;

public class SWEA_1946_간단한압축풀기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			System.out.println("#" + tc);
			int N = sc.nextInt();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < N; i++) {
				String text = sc.next();
				int tLength = sc.nextInt();
				
				for (int j = 0; j < tLength; j++) {
					sb.append(text);
					if (sb.length() % 10 == 0) { // 10번째마다 출력
						System.out.println(sb);
						sb.setLength(0); //스트링빌더 초기화
					}
				}
			}
			if (sb.length() > 0) //남은거 있으면 출력
				System.out.println(sb);
		}
	}
}
