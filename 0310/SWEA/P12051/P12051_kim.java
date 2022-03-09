package study_0310;

import java.util.Scanner;

public class SWEA_12051_프리셀통계 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int tn = 1; tn <= tc; tn++) {
			long n = sc.nextLong();
			int Pd = sc.nextInt();
			int Pg = sc.nextInt();
			boolean flag = false;
			String ans = "Possible";
			
			//오늘 게임의 승률이 100프로가 아닌데 전체 승률이 100프로 이거나
			//오늘 게임 승률이 0이 아닌데 전체 승률이 0이면 broken
			if((Pd != 100&&Pg == 100)||(Pd != 0&&Pg == 0)) {
				ans = "Broken";
			}
			
			//오늘 게임 한 판 수가 정수여야 함!
			for (long i = n; i >= 1; i--) {
				if ((i * Pd * 0.01) % 1 == 0) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				ans = "Broken";
			}

			System.out.println("#" + tn + " " + ans);
		}
	}

}
