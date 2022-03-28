import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P9280 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			// 입력 
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] r = new int[n+1];
			for(int i = 1 ; i <= n; i++) {
				r[i] = sc.nextInt();
			}
			int[] w = new int[m+1];
			for(int i = 1 ; i <= m; i++) {
				w[i] = sc.nextInt();
			}
			// 입출차 횟수
			int cnt = 2*m;
			int[] x = new int[cnt];
			for(int i = 0 ; i < cnt; i++) {
				x[i] = sc.nextInt();
			}
			// 차 별 단위 무게의 인덱스 (n의 인덱스 저장)
			int[] cost = new int[m+1];
			// 현재 주차장 상태 ( 차 있으면 1 차 없으면 0 )
			int[] currN = new int[n+1];
			// n개의 주차장이 다 차있는지 여부
			boolean isFull = false;

			// 차 개수 확인용 인덱스
			int idx = 1;
			// 차량 입장 순서
			int[] carIn = new int[m+1];
			// 대기 리스트
			Queue<Integer> waitList = new LinkedList<>();
			// 대기 리스트 유무
			boolean isWaiting = false;
			for(int i =0; i < cnt; i++) {
				// 입차
				if(x[i] > 0) {
					// 만석이었을 경우
					if(isFull) {
						// 대기리스트에 차량번호 추가
						waitList.offer(x[i]);
						isWaiting = true;
					}
					else {
						// 만석아닌 경우,
						room : for(int j = 1; j <= n; j++) {
							if(currN[j] == 0) {
								// 차량 입장 순서 저장(차량 번호 저장)
								carIn[idx] = x[i];
								// 차의 방 번호 저장 & idx 증가
								cost[idx++] = j;
								// 방 차있음으로 변경
								currN[j] =1;
								break room;
							}else if(currN[j] ==1 && j == n) {
								// 만석 표시
								isFull = true;
								// 대기리스트에 차량번호 추가
								waitList.offer(x[i]);
								isWaiting = true;
							}
						}
						
					}
					
				}
				// 출차
				else {
					// 해당차량이 입장한 방 번호 찾기
					int roomIdx = 0;
					for(int j =1; j <= m; j++) {
						if(carIn[j] == Math.abs(x[i])) {
							roomIdx = cost[j];
							break;
						}
					}
					// 해당 방 비우기
					currN[roomIdx] = 0;
					// 방이 비워졌으니 만석이 아니다.
					isFull = false;
					// 대기리스트가 있을 경우
					if(isWaiting) {
						// 대기 리스트부터 순차 입장
						for(int j = 0; j < waitList.size(); j++) {
							room : for(int k = 1; k <= n; k++) {
								if(currN[k] == 0) {
									carIn[idx] = waitList.poll();
									cost[idx++] = k;
									currN[k] = 1;
									break room;
								}else if(currN[k] == 1 && k == n) {
									// 빈자리가 없음을 확인 후 만석표시
									isFull = true;
								}
							}
							if(isFull) break;
						}
						// 대기 리스트가 입장 완료했으면 대기리스트 없음 표시
						if(waitList.size() == 0) {
							isWaiting = false;
						}
					}
				}
			}
			// 요금 계산
			int ans = 0;
			for(int i = 1; i<= m; i++) {
				// 주차장 번호 별 단위 무게 * 자동차 번호 별 무게
				ans += r[cost[i]] * w[carIn[i]];
			}
			System.out.println("#"+tc+" "+ans);
		}
		sc.close();
	}
}
