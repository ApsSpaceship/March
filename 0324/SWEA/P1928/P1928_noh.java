import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
 
        for (int tc = 1; tc <= t; ++tc) {
            sb.append("#" + tc + " ");
            char[] str = sc.next().toCharArray();
            for (int i = 0; i < str.length; i += 4) {
                int temp = 0;
                for (int j = 0; j < 4; ++j) {
                    char inco = 0;
                    if ('A' <= str[i + j] && str[i + j] <= 'Z')
                        inco = (char) (str[i + j] - 'A');
                    else if ('a' <= str[i + j] && str[i + j] <= 'z')
                        inco = (char) (str[i + j] - 'a' + 26);
                    else if ('0' <= str[i + j] && str[i + j] <= '9')
                        inco = (char) (str[i + j] - '0' + 52);
                    else if (str[i + j] == '+')
                        inco = 62;
                    else if (str[i + j] == '/')
                        inco = 63;
 
                    temp |= inco;
                    temp <<= 6;
                }
                temp >>= 6;
                char[] deco = new char[3];
                for (int j = 2; j >= 0; --j) {
                    deco[j] = (char) ((byte) temp | 0);
                    temp >>= 8;
                }
 
                for (int j = 0; j < 3; ++j)
                    sb.append(deco[j]);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
