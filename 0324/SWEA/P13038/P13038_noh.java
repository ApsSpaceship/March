import java.util.Scanner;
 
public class Solution {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
 
        for (int tc = 1; tc <= t; ++tc) {
            sb.append("#" + tc + " ");
            int n = sc.nextInt();
            int cnt = 0;
            int[] arr = new int[7];
            for (int i = 0; i < 7; ++i) {
                arr[i] = sc.nextInt();
                cnt += arr[i];
            }
 
            int ans = 0;
            ans += 7 * ((n - 1) / cnt);
            n = (n - 1) % cnt + 1;
 
            int minDays = 7;
            for (int i = 0; i < 7; ++i) {
                int idx = i;
                int cnt2 = 0;
                int temp = n;
                while (temp != 0) {
                    if (arr[idx] == 1)
                        --temp;
                    idx = (idx + 1) % 7;
                    ++cnt2;
                }
                minDays = Math.min(minDays, cnt2);
            }
            ans += minDays;
            sb.append(ans + "\n");
        }
        System.out.print(sb);
    }
}
