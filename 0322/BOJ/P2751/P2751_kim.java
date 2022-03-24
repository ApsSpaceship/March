package study_0322;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2751_수정렬하기2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		int max = Integer.MIN_VALUE;
		int[] sorted = new int[num];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (Integer.parseInt(br.readLine())+1000000);
			max = Math.max(max, arr[i]);	
		}
		int[]count = new int[max+1];
		for(int i = 0; i < arr.length; i++) {
			count[arr[i]]++; // 숫자가 몇 개 있는지 카운트한다.
		}
		
		for(int i = 1; i < count.length; i++) {
			count[i] += count[i - 1]; // 누적합
		}
		
		for(int i = arr.length-1; i >= 0; i--) {
			sorted[--count[arr[i]]] = arr[i];
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < sorted.length; i++) {
			sb.append(sorted[i]-1000000).append("\n");
		}
		System.out.println(sb.toString());
	}
}
