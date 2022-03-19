import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class bj_2609_최대공약수와최소공배수 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int b = sc.nextInt();

		int c = Math.max(a, b);

		int d = Math.min(a, b);

		List<Integer> arr = new LinkedList<>();

		// 최대공약수 구하기
		for (int i = 1; i <= d; i++) {

			if (c % i == 0 && d % i == 0)
				arr.add(i);
		}

		int maxi = 0;

		// 최소공배수 구하기

		for (int i = c;; i++) {

			if (i % a == 0 && i % b == 0) {
				maxi = i;
				break;
			}

		}

		System.out.println(arr.get(arr.size() - 1));
		System.out.println(maxi);
	}

}
