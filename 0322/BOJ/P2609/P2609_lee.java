import java.util.Scanner;

public class P2609 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 최대공약수 :입력 받은 두 수 중 작은 값으로 초기화
		int G = a;
		if(a > b) G = b;
		while (G != 0) {
			// 최대 공약수 구하기
			if(a % G == 0 && b % G == 0) {
				// 최대공약수
				System.out.println(G);
				// 최소 공약
				System.out.println(a * b / G);
				break;
			}else G--;
		}
		sc.close();
	}

}
