package com.ssafy.boj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P4153 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>(); 
		int cnt = 0;
		// 입력 받기 (0이 세번 들어오면 break;)
		while(true) {
			ArrayList<Integer> triangle = new ArrayList<>();
			for(int i = 0 ; i < 3; i++) {
				int tmp = sc.nextInt();
				if(tmp == 0) {
					cnt++;
				}else cnt = 0;
				triangle.add(tmp);
			}
			if(cnt == 3) break;
			arr.add(triangle);
		}
    // 각 테스트케이스가 직각삼각형인지 확인
		for(int i = 0 ; i < arr.size(); i++) {
			ArrayList<Integer> triangle = arr.get(i);
      // 오름차순 정렬
			Collections.sort(triangle);
      // swap 으로 내림차순 정렬 (크기 3으로 고정이므로)
			int tmp = triangle.get(0);
			triangle.set(0, triangle.get(2));
			triangle.set(2, tmp);
      // 피타고라스 정리로 직각삼각형인지 확인 후 결과 출력
			if(Math.pow(triangle.get(0), 2) == Math.pow(triangle.get(1), 2) + Math.pow(triangle.get(2), 2)) 
				System.out.println("right");
			else System.out.println("wrong");
		}
		sc.close();
	}
}
