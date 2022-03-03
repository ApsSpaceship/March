import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tc = 1; tc <= t; ++tc) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String ans = "ON";
            for (int i = 0; i < n; ++i) {
                if (m % 2 == 0) {
                    ans = "OFF";
                    break;
                }
                m >>= 1;
            }
            System.out.printf("#%d %s\n", tc, ans);
        }
    }
}
