import java.util.Arrays;
import java.util.Scanner;

public class P2108 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		float sumV = 0;
		int[] arr = new int[N];
		int[] ans = new int[4];
		for(int i = 0; i < N ; i++) {
			int num = sc.nextInt();
			sumV += num;
			arr[i] = num;
		}
		// 산술평균
		ans[0] = Math.round(sumV/N);
		// 오름차순 정렬
		Arrays.sort(arr);
		// 범위 : 최대 최소 차
		ans[3] = arr[N-1] - arr[0];
		// 중앙값
		ans[1] = arr[N/2];
		// 최빈값
		// 최대 개수
//		int cnt = 1;
		int cnt = 0;
		// 최빈값이 여러개일때, 두 번째로 작은 값 출력을 위해
		// 범위+1의 크기로 배열 생성
		int[] cnts = new int[ans[3]+1];
		// 개수 세기
		for(int i = 0; i < N ; i ++) {
			cnts[arr[i]-arr[0]]++;
		}
		// 같은 빈도수의 개수 찾기
		int maxCnt = 0;
		// 범위+1 내 반복
		// 제일 큰 값 찾기
		int maxCntIdx = 0;
		for(int i =0; i < ans[3]+1; i++) {
			if(cnt < cnts[i]) {
				maxCnt = 1;
				cnt = cnts[i];
				ans[2] = arr[0]+i;
				maxCntIdx = i;
			}else if(cnt == cnts[i]) {
				maxCnt++;
			}
		}
		// 여러개일 때,
		if(maxCnt != 1) {
			for(int i = maxCntIdx+1; i < ans[3]+1; i++) {
				// 현재 값보다 큰 것 찾고 포문 나가기
				if(cnt == cnts[i]) {
					ans[2] = arr[0]+i;
					break;
				}
			}
		}
//		int findSecond = 0;
//		for(int i =0; i < ans[3]+1; i++) {
//			if(cnt < cnts[i]) {
//				maxCnt = 1;
//				cnt = cnts[i];
//				ans[2] = arr[0]+i;
//			}else if(cnt == cnts[i]) {
//				if(maxCnt == 1 && arr[0]+i > ans[2] && findSecond == 0) {
//					ans[2] = arr[0]+i;
//					findSecond++;
//				}
//				maxCnt++;
//			}
//		}
		// 출력
		for(int i =0 ; i < 4; i++) {
			System.out.println(ans[i]);
		}
		sc.close();
	}
}
