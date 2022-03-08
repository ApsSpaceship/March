import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; ++i)
			arr[i] = sc.nextInt();

		Stack<Integer> st = new Stack<Integer>();
		StringBuilder ans = new StringBuilder();

		int cnt = 1;
		int idx = 0;
		boolean flag = true;
		while (!st.empty() || cnt != n + 1) {
			if (cnt == n + 1 && st.peek() != arr[idx]) {
				flag = false;
				break;
			}

			if (!st.empty() && st.peek() == arr[idx]) {
				ans.append("-\n");
				st.pop();
				++idx;
				continue;
			}
			ans.append("+\n");
			st.push(cnt++);
		}
		if (flag)
			System.out.printf("%s", ans);
		else
			System.out.printf("NO");
	}
}
