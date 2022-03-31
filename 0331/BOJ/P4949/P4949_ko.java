import java.util.Scanner;
import java.util.Stack;

public class BOJ_4949_균형잡힌세상 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			char[] line = sc.nextLine().toCharArray();
			String ans = "yes";
			if (line[0] == '.')
				break;
			Stack<Character> stack = new Stack<>();
			for (int i = 0; i < line.length - 1; i++) { // 맨 마지막은 .
				if (line[i] == '[' || line[i] == '(') // 여는 괄호면 스택에 넣기
					stack.push(line[i]);
				else if (line[i] == ']' && (stack.isEmpty() || stack.pop() != '[')) { // 닫는 괄호면 여는 괄호 스택에서 꺼내서 비교
					ans = "no";
					break;
				} else if (line[i] == ')' && (stack.isEmpty() || stack.pop() != '(')) {
					ans = "no";
					break;
				}
			}
			if(!stack.isEmpty()) // 스택이 비어있지 않다면
				ans = "no";
			
			System.out.println(ans);
		}
	}

}
