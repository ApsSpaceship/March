import java.util.Scanner;

public class P12051 {
	//1493 테케 통과
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			long N = sc.nextLong();
			int percD = sc.nextInt();
			int percG = sc.nextInt();
			boolean flag = true;
			// 불가능한 경우 
			if(percD != 0 && percG == 0) flag = false;
			else if(percD != 100 && percG == 100) flag = false;
			// 그 외의 경우
			else {
				for(int d = 1; d <=N; d++) {
					// d번 게임을 했을 때. 이기는 경우의 수는 정확히 나누어 떨어지므로, 올림과 버림이 같으면 적당한 d를 찾은 것.
					double tmp = d * percD /100;
					if(Math.ceil(tmp) == Math.floor(tmp)) {
						flag = true;
						break;
					}else flag = false;
				}
			}
			if(flag) System.out.println("#"+tc+ " Possible");
			else System.out.println("#"+tc+ " Broken");
		}
		sc.close();
	}
}

