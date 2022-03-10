import java.util.Scanner;
 
public class Solution {
    static int[] coins = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tc = 1; tc <= t; ++tc) {
            int n = sc.nextInt();
            System.out.println("#" + tc);
            for (int i = 0; i < coins.length; ++i) {
                System.out.print(n / coins[i] + " ");
                n %= coins[i];
            }
            System.out.println();
        }
    }
}
