import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj_1966_프린터큐 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 0; tc < T; tc++) {

			int size = sc.nextInt();

			int idx = sc.nextInt();

			// 배열생성
			int[] arr = new int[size];

			Queue<Integer> q = new LinkedList<>();

			for (int i = 0; i < size; i++) {

				arr[i] = sc.nextInt();
				q.add(arr[i]);
			}

			Arrays.sort(arr);

			int cnt = 0;
			int i = 1;

			while (!q.isEmpty()) {


				if (q.peek() == arr[size - i]) {

					q.poll(); 
					
					++cnt;

					if (idx == 0) {
						break;
					} else {
						++i;
						--idx;
					}

				} else {

					q.add(q.poll());

					if (idx == 0) {
						idx = q.size() - 1;// 요기 queue 의 사이즈 -1 로 // poll 되면 queue사이즈 바뀌니까!!!!!
					} else {
						--idx;
					}
				}

			}

			System.out.println(cnt);

		} // test case end

	}

}
