package d3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class d3_130038_교환학생 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			int classes = sc.nextInt(); // 들어야하는 수업 수

			int[] week = new int[7]; // 일주일 스케줄(0 or 1)

			Queue<Integer> one = new LinkedList<>(); // 1이면 인덱스 저장

			for (int i = 0; i < 7; i++) {

				week[i] = sc.nextInt();

				if (week[i] == 1) {
					one.add(i);
				}
			}

			int mincnt = Integer.MAX_VALUE;

			// 하루하루 daycnt++ && day와 classcnt가 같으면 정지
			// 최소값을 찾아야 하므로, 시작 날짜를 수업이 있는 날로 바꿔가며 카운트

			while (!one.isEmpty()) {

				int st = one.poll();

				int daycnt = 0; // 날짜 카운트

				int classcnt = 0; // 들은 수업 수 카운트

				for (int i = st;; i = (++i) % 7) {

					++daycnt;

					if (week[i] == 1)
						++classcnt;

					if (classes == classcnt)
						break;
				}

				mincnt = Math.min(mincnt, daycnt);
			}

			System.out.println("#" + tc + " " + mincnt);

		} // test case end

	}
}
