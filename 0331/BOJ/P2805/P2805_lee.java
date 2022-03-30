import java.util.Scanner;

// 시간 초과 (이분탐색으로 변경할 예정)
public class P2805 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 나무 수 
		int N = sc.nextInt();
		// 필요한 나무 길이
		int M = sc.nextInt();
		// 나무 높이 배열
		int[] t = new int[N];
		// 원하는 길이의 나무를 구하기 위해 자를 수 있는 최대 높이
		int H = 0;
		for(int i =0; i < N; i++) {
			t[i] = sc.nextInt();
			if(t[i] > H) H = t[i];
		}
		// 현재까지 나무를 구한 상황
		int currM = M;
		while(currM != 0) {
			if(currM == 0) break;
			else currM = M; 
			H--;
			for(int i = 0 ; i< N; i++) {
				if(t[i] > H) currM -= t[i]-H;
			}
		}
		System.out.println(H);
	}
}
