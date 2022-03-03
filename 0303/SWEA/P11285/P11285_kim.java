package study_0303;

import java.util.Scanner;

public class SWEA_11285_다트게임 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int tn = 1; tn <= tc; tn++) {
			int n = sc.nextInt();
			int[] line = { 20, 40, 60, 80, 100, 120, 140, 160, 180, 200 };
			int sum = 0;
			int x = 0;
			int y = 0;
			for (int i = 0; i < n; i++) {
				x = sc.nextInt();
				y = sc.nextInt();
				double c = Math.sqrt(x * x + y * y); //피타고라스로 길이를 파악한다.
				if (c > 200) { //200이상은 점수가 없음
					continue;
				} else {
					int idx = 0;
					for (int j = 0; j < line.length; j++) {
						if (c <= line[j]) {
							idx = j;
							break;
						}
					}
					sum += (11 - line[idx] / 20); // 20 * (11 - p)인 경우 p점을 획득
				}
			}
			System.out.println("#" + tn + " " + sum);
		}
	}
}
