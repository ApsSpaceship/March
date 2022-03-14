package study_0315;

import java.util.Scanner;

public class baekjoon_2231_분해합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String check = Integer.toString(num);
		int len = check.length(); // 입력받은 수의 길이
		int a = check.charAt(0)-'0'; // 입력받은 수의 첫째자리 수
		int min = num-((len-1)*9)-(a-1); // 각 자리수에서 더할 수 있는 최댓값을 빼주었다.
		int ans = 0;
		for(int i = min; i <= num; i++) {
			int an = i;
			int sum = i;
			while(an > 0) {
				sum += (an % 10);
				an = an / 10;
			}
			if(sum == num) {
				ans = i;
				break;
			}
		}
		
		System.out.println(ans);
	}

}
