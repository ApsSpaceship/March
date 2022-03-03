import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tc = 1; tc <= t; ++tc) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[][] board = new int[n][n];
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < n; ++j)
                    board[i][j] = sc.nextInt();
 
            int cnt = 0;
            for (int i = 0; i < n; ++i) {
                int combo1 = 0; // 가로
                int combo2 = 0; // 세로
                for (int j = 0; j < n; ++j) {
                    if (board[i][j] == 1) {
                        ++combo1;
                        if (combo1 == k && (j == n - 1 || board[i][j + 1] == 0))
                            ++cnt;
                    } else
                        combo1 = 0;
 
                    if (board[j][i] == 1) {
                        ++combo2;
                        if (combo2 == k && (j == n - 1 || board[j + 1][i] == 0))
                            ++cnt;
                    } else
                        combo2 = 0;
                }
            }
            System.out.printf("#%d %d\n", tc, cnt);
        }
    }
}
