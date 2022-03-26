import java.util.Scanner;

public class P1945 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
      StringBuilder sb = new StringBuilder();
			int num = sc.nextInt();
//			N=2a x 3b x 5c x 7d x 11e
			int[] ans = new int[5];
			int[] arr = { 2, 3, 5, 7, 11 };
      sb.append("#"+tc);
			for (int i = 0; i < 5; i++) {
				while (num % arr[i] == 0) {
					if (num % arr[i] != 0) break;
					num /= arr[i];
					ans[i]++;
				}
        sb.append(" " + ans[i]);
			}
			System.out.println(sb.toString());			
		}
		sc.close();
	}
}
