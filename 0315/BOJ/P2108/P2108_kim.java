package study_0315;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon_2108_통계학 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] check = new int[8001]; // 수의 절대값 4000을 넘지 않음
		double sum = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			check[arr[i]+4000]++; // 수가 음수일때를 생각하여 +4000을 함 (최솟값 -4000)
		}
		int max = 0;
		for(int i = 0; i <check.length; i++) {
			max = Math.max(max, check[i]);
		}
		int result = 0;
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 0; i < check.length; i++) {
			if(max == check[i]) {
				queue.add(i-4000);
			}
			
		}
		
		Arrays.sort(arr);
		
		System.out.println((int)Math.round(sum/n));
		System.out.println(arr[n/2]);
		if(queue.size()==1) { // 최빈수가 1개일때 바로 출력
			System.out.println(queue.peek());
		}else {
			//최빈수가 1개 이상일 때 2번째 출력
			queue.poll();
			System.out.println(queue.peek());
		}
		System.out.println(arr[n-1]-arr[0]);
		
		
		
		
	}

}
