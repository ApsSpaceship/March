package d3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class d3_9280_진용이네주차타워 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			// 주차장 칸수
			int parkinglot = sc.nextInt();

			// 주차장
			int[] park = new int[parkinglot+1];

			// 차량대수
			int cars = sc.nextInt();

			// 주차장 칸별 요금
			int[] fee = new int[parkinglot];

			for (int i = 0; i < fee.length; i++) {

				fee[i] = sc.nextInt();
			}

			// 차량 i당 무게
			int[] carw = new int[cars];

			for (int i = 0; i < carw.length; i++) {

				carw[i] = sc.nextInt();
			}

			// 요금합 변수
			int sum = 0;

			// 차량 입출

			int k = cars * 2;

			
			Queue<Integer> wait = new LinkedList<>();
			
			
			while (k > 0) {

				k--;

				int c = sc.nextInt();

				for (int i = 0; i < park.length; i++) {

					if (c > 0) {

						if (park[i] == 0 && i!=park.length-1) {

							park[i] = c;

							break;
						}else if(i == park.length-1){
							
							// 주차장 다 찼는데 차량 옴 -> 대기
							wait.add(c);
							
						}
					} else {

						if (park[i] == Math.abs(c)) {

							sum += fee[i] * carw[Math.abs(c)-1];
							
							if(!wait.isEmpty()) {
								park[i] = wait.poll();
							}else {
								
								park[i] = 0; // 자리 비우기
							}
							
							break;
						}
					} // else end
				} // for end

			} // while end

			System.out.println("#"+tc+" "+sum);

		} // test case end

	}

}
