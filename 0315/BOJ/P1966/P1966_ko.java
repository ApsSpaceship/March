package Study_20220311_17;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_1966_프린터큐 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt(); // 문서 개수
			int M = sc.nextInt();// 큐에서 내가 확인할 문서의 위치
			Queue<Integer> q = new LinkedList<Integer>(); //문서 저장
			Integer[] imp = new Integer[N]; //중요도 저장
			int cnt = 0; //출력한 문서 개수
			int idx = 0; //중요도 인덱스
			
			int tmp;
			for (int i = 0; i < N; i++) { // 문서들 순서대로 중요도 입력
				tmp = sc.nextInt();
				imp[i] = tmp;
				q.add(tmp);
			}

			Arrays.sort(imp, Collections.reverseOrder()); // 중요도 최대~최소로 정렬
			
			while (true) {
				while (q.peek() != imp[idx]) { // q의 맨 앞이 현재 큐 값 중 최댓값일 때까지
					q.add(q.poll()); //순서 맨 뒤로 넘김
					if (--M < 0)// 내가 확인할 문서 위치가 앞당겨짐
						M = q.size() - 1; // M=-1이면 맨뒤로
				}
				q.poll(); //중요도 가장 큰 문서 출력
				cnt++; //출력한 문서 개수 증가
				idx++; //중요도 인덱스 증가
				if (M-- == 0) // M이 0이면 끝, 아니면 내가 확인할 문서 위치가 앞당겨짐
					break;
			}

			System.out.println(cnt);
		}

	}

}
