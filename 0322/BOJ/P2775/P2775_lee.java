import java.util.Scanner;

public class P2775 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int K = sc.nextInt();
			int N = sc.nextInt();
			int[][] arr = new int[K+1][N+1];
			for(int i = 0 ; i < N+1; i++) {
				arr[0][i] = i;
			}
			for(int i = 0; i < K+1; i++) {
				arr[i][1] = 1;
			}
			for(int k = 1; k < K+1; k++) {
				for(int n = 2; n < N+1; n++) {
					arr[k][n] = arr[k][n-1] + arr[k-1][n];
				}
			}
			System.out.println(arr[K][N]);
		}
		sc.close();
	}

}
