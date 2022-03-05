package Study_20220304_10;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_1874_스택수열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		Stack<Integer> stack = new Stack();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) { //숫자 입력
			num[i] = sc.nextInt();
		}
		
		int i = 0; //배열 인덱스
		int cnt = 0; //스텍에 넣을 숫자
		
		while (cnt <= n && i < n) { //스텍에 넣은 숫자가 n보다 크거나 모든 인덱스 확인하면 끝
			//스택이 비거나 스택에서 픽한 값이 현재 배열 값과 다르면서 스택에 넣은 숫자가 n보다 크지 않을 때 push
			while ((stack.isEmpty() || stack.peek() != num[i]) && cnt <= n) {
				stack.add(++cnt);
				sb.append("+\n");
			}
			//스택에서 픽한 값이 현재 배열 값과 같으면 팝, 현재 배열 인덱스 증가
			if (!stack.isEmpty() && stack.peek() == num[i]) { 
				stack.pop();
				sb.append("-\n");
				i++;
			}
		}
		if (i != n) //인덱스를 모두 확인하지 못했다면 수열 만들 수 없음
			System.out.print("NO");
		else
			System.out.print(sb.toString());
	}

}
