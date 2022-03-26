package d3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class d3_10580_전봇대 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			int t = sc.nextInt(); // 전봇대 선 개수

			int[] x = new int[t]; 

			Map<Integer, Integer> y = new HashMap<>();

			for (int i = 0; i < t; i++) {

				x[i] = sc.nextInt(); // 전선 시작점

				y.put(x[i], sc.nextInt()); // 전선 끝점

			}

			int cnt = 0;

			Arrays.sort(x); // 시작점 정렬

			for (int i = 0; i < t - 1; i++) {

				for (int j = i + 1; j < t; j++) {

					if (y.get(x[i]) > y.get(x[j])) // 시작점이 낮으면서 끝점이 높으면 카운트
						cnt++;

				}

			}

			System.out.println("#" + tc + " " + cnt);

		} // test case end

	}

}
