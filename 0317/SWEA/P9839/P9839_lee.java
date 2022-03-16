import java.util.Scanner;

public class P9839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			for(int i =0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			int maxV = -1;
			for(int i = 0; i < N-1 ; i++) {
				for(int j = i+1; j < N; j++) {
					int mulVal = arr[i] * arr[j];
					if(isIncreased(mulVal)) {
						maxV = Math.max(maxV, mulVal);
					}
				}
			}
			System.out.println("#"+tc+" "+ maxV);
		}
		sc.close();
	}
	public static boolean isIncreased(int mulVal) {
		String mulStr = Integer.toString(mulVal);
		for(int i =0; i < mulStr.length()-1; i++ ) {
			if(mulStr.charAt(i) + 1 != mulStr.charAt(i+1)) return false;
		}
		return true;
	}
}
