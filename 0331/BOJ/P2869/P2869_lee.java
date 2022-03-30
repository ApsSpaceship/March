import java.util.Scanner;

public class P2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		// 시간 초과
//		int ans = 0;
//		int curr = 0;
//		while(true) {
//			ans++;
//			curr+= A;
//			if(curr >= V) break;
//			curr-= B;
//		}
		// 걸리는 일수 ans
		// 정상에 도착하면 내려가지 않으니까 내려가는건 x-1로 연산
		// A * ans - B * (x-1) >= V 이면 x가 답이다.
		// 하지만 이에 해당하지 않을 경우 한번 더 올라가야 하므로, 하루 더 걸린다.
		int ans = (V-B) / (A-B);
		if((A-B)* ans +B < V) ans ++; 
		System.out.println(ans);
		sc.close();
	}
}
