import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
 
public class Solution {
    static class Pair {
        int first;
        int second;
 
        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
 
    static String[] grade = { "A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0" };
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tc = 1; tc <= t; ++tc) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            Pair[] score = new Pair[n];
            for (int i = 0; i < n; ++i) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                score[i] = new Pair(a * 35 + b * 45 + c * 20, i);
            }
            Arrays.sort(score, new Comparator<Pair>() {
                @Override
                public int compare(Pair a, Pair b) {
                    return b.first - a.first;
                }
            });
            for (int i = 0; i < n; ++i)
                if (score[i].second == k - 1) {
                    System.out.printf("#%d %s\n", tc, grade[i / (n / 10)]);
                    break;
                }
        }
    }
}
