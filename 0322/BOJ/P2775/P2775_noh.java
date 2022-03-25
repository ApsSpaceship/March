import java.util.Scanner;

public class Main {
	static int[][] board = new int[15][15];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i <= 14; ++i)
			for (int j = 1; j <= 14; ++j)
				if (i == 0)
					board[i][j] = j;
				else
					board[i][j] = board[i][j - 1] + board[i - 1][j];

		int t = sc.nextInt();
		for (int tc = 1; tc <= t; ++tc) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(board[k][n]);
		}
	}
}
