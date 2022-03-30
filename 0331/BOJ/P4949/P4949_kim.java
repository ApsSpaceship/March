package study_0329;

import java.util.Scanner;
import java.util.Stack;

public class baekjoon_P4949_균형잡힌세상 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		while (true) {
			String ans = "yes";
			StringBuilder sb = new StringBuilder();
			while (true) {
				String a = sc.nextLine();
				sb.append(a);
				int len = a.length();
				// 줄의 마지막 문자가 '.' 이면 입력 끝!
				if(a.charAt(len-1)=='.')
					break;
			}
			if (sb.length() == 1 && sb.charAt(0) == '.') {
				break;
			}
			for (int i = 0; i < sb.length(); i++) {
				if (sb.charAt(i) == '[' || sb.charAt(i) == '(') {
					stack.add(sb.charAt(i));
				} else if (sb.charAt(i) == ']') {
					if (!stack.empty() && stack.peek() == '[') {
						stack.pop();
					} else {
						ans = "no";
						break;
					}
				} else if (sb.charAt(i) == ')') {
					if (!stack.empty() && stack.peek() == '(') {
						stack.pop();
					} else {
						ans = "no";
						break;
					}
				}
			}
			// 스택이 비어있지 않으면 열린괄호가 더 많다는 뜻이니까 no!
			if(!stack.empty()) {
				ans="no";
			}

			System.out.println(ans);
			stack.clear();

		}
	}

}
