import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tc = 1; tc <= t; ++tc) {
            long n = sc.nextLong();
            int pd = sc.nextInt();
            int pg = sc.nextInt();
            if ((pd != 0 && pg == 0) || (pd != 100 && pg == 100))
                System.out.println("#" + tc + " Broken");
            else {
                if (n < (100 / gcd(100, pd)))
                    System.out.println("#" + tc + " Broken");
                else
                    System.out.println("#" + tc + " Possible");
            }
        }
    }
 
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
