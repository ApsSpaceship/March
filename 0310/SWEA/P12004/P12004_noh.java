import java.util.Scanner;
  
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        outer: for (int tc = 1; tc <= t; ++tc) {
            int n = sc.nextInt();
            for (int a = 1; a <= 9; ++a)
                for (int b = 1; b <= 9; ++b)
                    if (n == a * b) {
                        System.out.println("#" + tc + " Yes");
                        continue outer;
                    }
            System.out.println("#" + tc + " No");
        }
    }
}
