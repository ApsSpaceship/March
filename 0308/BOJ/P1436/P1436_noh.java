import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 666;
		int cnt = 0;
		while (true) {
			if (check(num++))
				++cnt;

			if (cnt == n) {
				System.out.printf("%d", num - 1);
				break;
			}
		}
	}

	static boolean check(int num) {
		while (num >= 666) {
			if (num % 1000 == 666)
				return true;
			num /= 10;
		}
		return false;
	}
}
 
