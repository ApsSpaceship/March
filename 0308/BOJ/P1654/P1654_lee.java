
import java.util.Scanner;

public class P1654 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 기존 랜선 개수 K
		int K = sc.nextInt();
		// 필요한 랜선 개수 N
		int N = sc.nextInt();
		// 기존 랜선의 각 길이
		int[] arr = new int[K];
		// 전체 랜선 길이의 합
		int sumV = 0;
		// 각 랜선 길이 입력 + 합 구하기
		for (int i = 0; i < K; i++) {
			arr[i] = sc.nextInt();
			sumV += arr[i];
		}
		// 최대 가능한 값 = 합 / 필요한 개수
		long maxV = sumV / N;
		// 개수
		int cnt = 0;
		// 시작값, 끝값
		long st = 1;
		long ed = maxV;
		// 중간값
		long mid = 0;
		// 구하고자 하는 값
		long ans = 0;
		// 시작이 끝과 같거나 그보다 작을때는 탐색 가능
		while (st <= ed) {
			cnt = 0;
			mid = (st + ed) / 2;
			for (int i = 0; i < K; i++) {
				cnt += arr[i] / mid;
			}
			if (cnt == N) { // 탐색 성공
				// 찾고자 하는 키값이 중간 값보다 클 때는 중간값 기준 오른쪽 탐색
				ans = mid;
				// 찾고자 하는 키값이 중간 값보다 작을 때는 중간값 기준 왼쪽 탐색
			} else if (cnt < N) {
				ed = mid - 1;
			} else {
				st = mid + 1;
			}
		}
		// 출력
		System.out.println(ans);
	}
}
