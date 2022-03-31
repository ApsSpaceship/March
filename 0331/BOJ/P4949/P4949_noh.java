import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			char[] str = sc.nextLine().toCharArray();
			if (str.length == 1)
				break;

			Stack<Character> st = new Stack<Character>();
			boolean yes = true;
			for (int i = 0; i < str.length; ++i)
				if (str[i] == '[')
					st.add(str[i]);
				else if (str[i] == '(')
					st.add(str[i]);
				else if (str[i] == ']') {
					if (st.empty() || st.peek() != '[') {
						yes = false;
						break;
					} else
						st.pop();
				} else if (str[i] == ')') {
					if (st.empty() || st.peek() != '(') {
						yes = false;
						break;
					} else
						st.pop();
				}
			if (!st.empty())
				yes = false;
			System.out.println(yes ? "yes" : "no");
		}
	}
}
