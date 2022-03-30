import java.util.Scanner;
import java.util.Stack;

public class bj_4949_균형잡힌세상 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			char[] text = sc.nextLine().toCharArray();

			Stack<Character> check = new Stack<>();

			if (text.length == 1) // 마지막에 . 입력받으면 멈추기
				break;

			Boolean flag = true;

			for (int i = 0; i < text.length; i++) {

				switch (text[i]) {
				case '[':
				case '(':
					check.add(text[i]); // 열린괄호는 스택에 넣기
					break;
				case ']':
					if (check.isEmpty() || check.peek() != '[') {
						flag = false; // 잘못된 경우
					} else {
						check.pop();

					}
					break;
				case ')':
					if (check.isEmpty() || check.peek() != '(') {
						flag = false; // 잘못된 경우
					} else {

						check.pop();
					}
					break;

				}// switch end
			}

			if (!check.isEmpty()) // 조건 빠트리지 말기 ex) [()][.
				flag = false;

			if (flag) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}

		} // while end
	}
}
