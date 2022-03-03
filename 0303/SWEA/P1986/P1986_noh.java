import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tc = 1; tc <= t; ++tc) {
            int n = sc.nextInt();
            System.out.printf("#%d %d\n", tc, n % 2 == 0 ? -n / 2 : (n + 1) / 2);
        }
    }
}
