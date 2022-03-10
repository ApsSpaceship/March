import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tc = 1; tc <= t; ++tc) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a >= 10 || b >= 10) {
                System.out.println("#" + tc + " -1");
                continue;
            }
            System.out.println("#" + tc + " " + a * b);
        }
    }
}
