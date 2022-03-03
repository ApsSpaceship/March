import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tc = 1; tc <= t; ++tc) {
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < n; ++i) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int d = x * x + y * y;
                for (int r = 20; r <= 200; r += 20)
                    if (d <= r * r) {
                        sum += (11 - r / 20);
                        break;
                    }
            }
            System.out.printf("#%d %d\n", tc, sum);
        }
    }
}
