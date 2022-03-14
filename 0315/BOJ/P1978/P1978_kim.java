package study_0315;

import java.util.Scanner;

public class baekjoon_1978_소수찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			int check = 0;
			boolean flag = true;
			if(num == 1) {
				continue;
			}
			for(int j = 1; j <= num; j++) {
				//j가 num의 약수이면 check++;
				if(num % j == 0) {
					check++;
				}
				//소수는 약수가 2개 여야 하므로!
				if(check > 2) {
					flag = false;
					break;
				}
			}
			if(flag) {
				count++;
			}
		}
		System.out.println(count);
	}

}
