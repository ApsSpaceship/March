import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SWEA_9280_진용이네주차타워 {
	static int sum = 0;
	static int n = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			n = sc.nextInt();
			int m = sc.nextInt();
			sum = 0;
			int[] parkPrice = new int[n]; // 주차장 비용
			int[] car = new int[m]; // 차 무게
			int[] garage = new int[n]; // 주차장 상황
			HashMap<Integer, Integer> parkCarMap = new HashMap<>(); // 주차된 차들
			Queue<Integer> waitCar = new LinkedList<>();// 대기하는 차들
			for (int i = 0; i < n; i++) {
				parkPrice[i] = sc.nextInt();
			}
			for (int i = 0; i < m; i++) {
				car[i] = sc.nextInt();
			}
			int state = 0;
			for (int i = 0; i < 2 * m; i++) {
				state = sc.nextInt(); // 이번 차 번호
				if (state > 0) { // 주차
					if (parking(state, parkPrice, car, garage, parkCarMap)) { // 주차 실패하면 큐에서 대기
						waitCar.add(state);
					}
				} else { // 차 빼~
					garage[parkCarMap.get(-state)] = 0;
					if (!waitCar.isEmpty()) { // 대기하는 차 있으면
						parking(waitCar.poll(), parkPrice, car, garage, parkCarMap);
					}
				}
			}
			System.out.println("#" + tc + " " + sum);
		}
	}

	public static boolean parking(int state, int[] parkPrice, int[] car, int[] garage,
			HashMap<Integer, Integer> parkCarMap) {
		boolean flag = true; // 주차 실패 여부
		for (int j = 0; j < n; j++) { // 앞 부터
			if (garage[j] == 0) { // 빈 자리가 있다면
				garage[j] = 1; // 자리 채움
				parkCarMap.put(state, j); // 차 위치 저장
				sum += parkPrice[j] * car[state-1];
				flag = false;
				break;
			}
		}
		return flag;
	}
}
