import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 
public class Solution {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
 
        for (int tc = 1; tc <= t; ++tc) {
            sb.append("#" + tc + " ");
 
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] R = new int[n + 1];
            int[] W = new int[m + 1];
            boolean[] park = new boolean[n + 1];
            int[] parkPos = new int[m + 1];
            for (int i = 1; i <= n; ++i)
                R[i] = sc.nextInt();
            for (int i = 1; i <= m; ++i)
                W[i] = sc.nextInt();
 
            int ans = 0;
            Queue<Integer> q = new LinkedList<Integer>();
            for (int i = 1; i <= 2 * m; ++i) {
                int a = sc.nextInt();
 
                if (a > 0)
                    q.add(a);
                else if (a < 0)
                    park[parkPos[-a]] = false;
 
                if (!q.isEmpty()) {
                    int front = q.peek();
                    for (int j = 1; j <= n; ++j)
                        if (!park[j]) {
                            ans += R[j] * W[front];
                            park[j] = true;
                            parkPos[front] = j;
                            q.remove();
                            break;
                        }
                }
            }
 
            sb.append(ans + "\n");
        }
        System.out.print(sb);
    }
}
