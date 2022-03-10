import java.util.Scanner;

public class P12221 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a > 9 || b > 9) {
				 System.out.println("#"+tc+" -1");
			}else {
				 System.out.println("#"+tc+" "+a * b);
			}
		}
		sc.close();
	}
}
