import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; ++i)
			arr[i] = sc.nextInt();
		Arrays.sort(arr);
		for (int i = 0; i < n; ++i)
			sb.append(arr[i] + "\n");
		System.out.print(sb);
	}
}
