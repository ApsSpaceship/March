import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
 
class Pair {
    int first;
    int second;
 
    Pair() {
 
    }
 
    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
 
public class Solution {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
 
        for (int tc = 1; tc <= t; ++tc) {
            sb.append("#" + tc + " ");
            int n = sc.nextInt();
            Pair[] arr = new Pair[n];
            for (int i = 0; i < n; ++i)
                arr[i] = new Pair(sc.nextInt(), sc.nextInt());
 
            Arrays.sort(arr, new Comparator<Pair>() {
                @Override
                public int compare(Pair o1, Pair o2) {
                    if (o1.first == o2.first)
                        return 0;
                    if (o1.first < o2.first)
                        return -1;
                    return 1;
                }
            });
 
            int cnt = 0;
            for (int i = 0; i < n - 1; ++i)
                for (int j = i + 1; j < n; ++j)
                    if (arr[i].second > arr[j].second)
                        ++cnt;
 
            sb.append(cnt + "\n");
        }
        System.out.print(sb);
    }
}
