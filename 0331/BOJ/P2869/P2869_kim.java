package study_0329;

import java.util.Scanner;

public class baekjoon_P2869_달팽이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int up = sc.nextInt();
		int down = sc.nextInt();
		int top = sc.nextInt();
		int ans = 0;
		
		int realup = up - down; // 하루동안 실제 올라가는 높이
		
		//정상까지 올라가면 내려가지 않는다고 했으니 몫을 top-up으로 함!
		if(((top-up)%realup)==0) {
			ans = ((top-up)/realup);
		}else {
			ans = ((top-up)/realup)+1;
		}
		// 나눠야 할 값을 top-up으로 지정해서 ans에 +1함!(마지막으로 한번 올라가야 하므로)
		System.out.println(ans +1); 
	}

}
