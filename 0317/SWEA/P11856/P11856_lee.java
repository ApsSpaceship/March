import java.util.Scanner;

public class P11856 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			char[] s = sc.next().toCharArray();
			// 첫번째를 시작으로 같은 것이 몇개 있는지 여부 파악
			int[] cnt = new int[3];
			// 서로 비교
			for (int i = 0; i < 3; i++) {
				for (int j = i+1; j < 4; j++) {
					// 자신을 제외하고 같은게 있으면 ++
					if(s[i] == s[j]) {
						cnt[i]++;
					}
				}
			}
			// 알파벳 개수
			int alphaCnt = 0;
			// 자신을 제외하고 같은개 1개 더 있는 것이 몇개인지 확인
			for(int i =0 ; i < 3; i ++ ) {
				if(cnt[i] == 1) alphaCnt++;
			}
			// 알파벳 개수가 2개라면
			if(alphaCnt == 2) {
				System.out.println("#"+tc+" Yes");
			}else {
				// 아닌 경우 
				System.out.println("#"+tc+" No");
			}
		}
		sc.close();
	}
}
