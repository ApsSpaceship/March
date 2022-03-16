import java.util.Scanner;

public class P12741 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
      // X 전구 시작 끝 입력
			int A = sc.nextInt();
			int B = sc.nextInt();
      // Y 전구 시작 끝 입력
			int C = sc.nextInt();
			int D = sc.nextInt();
			
      // 동시에 켜지는 시간 길이
			int ans = 0;
      // 동시에 켜지는 시간 (시작)
			int st = 0;
      // 더이상 동시에 켜져있지 않는 시간 (끝)
			int ed = 0;
      // 전구가 켜지는 시간 비교해서 큰 값
			if(A >= C) {
				st = A;
			}else { 
				st = C;
			}
      // 전구가 꺼지는 시간 비교해서 작은 값
			if(B <= D) {
				ed = B; 
			}else {
				ed = D;
			}
      // 시작이 끝보다 작을 때만 동시에 켜진다는 것을 의미
			if(st < ed) {
        // 길이 = 끝 - 시작
				ans = ed - st;
			}
			System.out.println("#"+tc+" "+ans);
		}
		sc.close();
	}
}
