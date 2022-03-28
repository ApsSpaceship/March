package study_0324;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class swea_P9280_진용이주차장 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int tn = 1; tn <= tc; tn++) {
			int n = sc.nextInt(); // 주차공간 수
			int m = sc.nextInt(); // 오늘 이용할 차량 수
			int[] cost = new int[n]; // 주차 공간의 단위 무게 당 요금
			int[]park = new int[n]; // 주차장(인덱스 : 주차공간번호, 값 : 차량번호 )
			int[] weight = new int[m+1]; // 차량 무게
			Queue<Integer> queue = new LinkedList<>(); // 대기하는 차량
			for(int i = 0; i < n; i++) {
				cost[i] = sc.nextInt();
			}
			for(int i = 1; i < m+1; i++) {
				weight[i] = sc.nextInt();
			}			
			long total = 0;
			for(int i = 0; i < (m*2) ; i++) {
				int check = sc.nextInt();
				if(check > 0) {
					int min = -1;
					for(int j = 0; j < park.length; j++) {						
						if(park[j] == 0) {
							min=j;
							break;
						}
					}
					//주차장에 빈 공간이 없다면 대기장소로 보냄
					if(min == -1) {
						queue.add(check);
						
					}else {
						total += (weight[check]*cost[min]);
						park[min] = check;
					}					
				}else {
					for(int j = 0; j < park.length; j++) {
						if(park[j] == Math.abs(check)) {
							park[j] = 0; // 주차장 비워줌
							//만약 대기공간이 비어있지 않으면  즉 대기차량이 존재하면
							if(!queue.isEmpty()) {
								total += (weight[queue.peek()] * cost[j]); 
								park[j] = queue.poll();
							}
						}
					}
					
				}
			}
			
			System.out.println("#"+tn+" "+total);
		}
	}

}
