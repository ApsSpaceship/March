package study_0308;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class baekjoon_1874_스택수열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt(); // 1~n까지의 수
		int count = 0;
		int numcheck = 0; // stack에 넣을 숫자 시작점
		boolean flag = true;
		out:while(n > count) {
			int num = sc.nextInt();			
			if(num > numcheck) { // 입력받은 숫자가 stack에 넣은 숫자보다 크면 stack에 넣은 값+1부터 입력받은 수 까지 저장
				for(int i = numcheck+1; i <= num; i++) {
					stack.push(i);
					sb.append("+").append("\n");
				}
				numcheck = num;
			}else if(stack.peek() != num) { //스택의 맨 위에 값이 num하고 같지 않으면 false
				flag = false;
				break out;
			}
			
			stack.pop();
			sb.append("-").append("\n");	
			
			count++;
		}
		if(flag) {
			System.out.println(sb.toString());
		}else {
			System.out.println("NO");
		}
		
		
	}
}
