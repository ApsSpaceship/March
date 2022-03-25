import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 1;
		while (3 * ans * (ans - 1) + 1 < n)
			++ans;
		System.out.println(ans);
	}
}

///////////////////////////////////////////

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 1;
		int num = 1;
		while (num < n)
			num += 6 * (ans++);
		System.out.println(ans);
	}
}
