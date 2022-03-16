package study_0317;

import java.util.Scanner;

public class SWEA_12741_전구 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int tn = 1; tn <= tc; tn++) {
			int[] arr = new int[101]; // 100초 이하로 들어와서 101로 크기 결정
			for (int i = 0; i < 2; i++) {
				int s = sc.nextInt();
				int e = sc.nextInt();
				for (int j = s; j <= e; j++) {
					arr[j]++; // 초 켜져있는 시간대 측정하기 위해
				}
			}
			int check = 0;
			for (int i = 0; i < arr.length; i++) {
				// 둘 다 켜져 있으면 2니까 check++;
				if (arr[i] == 2) {
					check++;
				}
			}
            if(check-1 >= 0) {
            	check -= 1;
            }
			System.out.println("#" + tn + " " + check);
		}
	}

}
