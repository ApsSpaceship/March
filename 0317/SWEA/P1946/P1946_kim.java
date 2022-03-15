package study_0317;

import java.util.Scanner;

public class swea_1946_압축풀기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int tn = 1; tn <= tc ; tn++) {
			StringBuilder sb = new StringBuilder();
			int n = sc.nextInt();
			for(int i = 0; i < n; i++) {
				char c = sc.next().charAt(0); // 문자입력
				int num = sc.nextInt(); // 해당 문자 몇 개 있는지
				for(int j = 0; j < num; j++) {
					sb.append(c); // 입력받은 숫자만큼 문자 저장
				}
			}
			System.out.println("#"+tn);
			for(int i = 0; i < sb.length(); i++) {
				// 10개씩 출력하기
				if(i != 0 && (i % 10 == 0)) {
					System.out.println();
				}
				System.out.print(sb.charAt(i));
				
			}
			System.out.println();
		}
	}

}
