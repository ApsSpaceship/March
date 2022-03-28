import java.util.Scanner;

public class P13038 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1 ;tc<= T; tc++) {
			int n = sc.nextInt();
			int[] week = new int[8];
			for(int i = 1; i< 8; i++) {
				week[i] = sc.nextInt();
			}
			int ans = 0;
			while(true) {
				if(n == 0) break;
				for(int i = 1; i< 8; i++) {
					if(n == 0) break;
					ans++;
					if(week[i] == 1) {
						n--;
					}

				}
			}
			System.out.println("#"+tc+" "+ans);
			
		}
	}

}
