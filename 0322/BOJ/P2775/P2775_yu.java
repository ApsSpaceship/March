import java.util.Scanner;

public class bj_2775_부녀회장이될테야 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 0; tc < T; tc++) {

			int k = sc.nextInt(); // 층

			int n = sc.nextInt(); // 호수

			// 0층 셋팅

			int[] apt = new int[n];

			for (int i = 0; i < apt.length; i++) {
				apt[i] = i + 1;
			}

			// 층수가 k-1이 될 때까지 반복

			int floor = 0;

			while (floor != k) {

				for (int i = 1; i < apt.length; i++) {

					apt[i] += apt[i - 1];
				}

				floor++;
			}

			System.out.println(apt[n - 1]);

		} // test case end

	}

}
