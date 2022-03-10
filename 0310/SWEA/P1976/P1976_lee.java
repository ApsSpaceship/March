
import java.util.Scanner;

public class P1976 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int[] inputTime = new int[4];
			for(int i = 0; i < 4; i++) {
				inputTime[i] = sc.nextInt();
			}
			int h =0;
			int m =0;
			h = inputTime[0] + inputTime[2];
			m = inputTime[1] + inputTime[3];
			if(m > 60) {
				m -= 60;
				h++;
			}
			if(h > 12) {
				h -= 12;
			}
			System.out.println("#"+tc+" "+h+" "+m);
		}
		sc.close();
	}

}
