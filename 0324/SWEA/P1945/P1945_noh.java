import java.util.Scanner;
 
public class Solution {
    static int[] prime = { 2, 3, 5, 7, 11 };
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
 
        for (int tc = 1; tc <= t; ++tc) {
            sb.append("#" + tc + " ");
            int n = sc.nextInt();
            for (int i = 0; i < 5; ++i) {
                int cnt = 0;
                while (n % prime[i] == 0) {//
                    n /= prime[i];
                    ++cnt;
                }
                sb.append(cnt + " ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
