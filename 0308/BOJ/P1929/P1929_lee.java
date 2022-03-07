import java.util.Scanner;

public class P1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		// N-M 차이 내 숫자 중 소수 인 것은 출력
		for(int i = 0; i<=N-M;i++) {
			int num = M+i;
			// 소수 여부 확인
			if(isPrime(num))
				System.out.println(num);
		}
		sc.close();
	}

	public static boolean isPrime(int num) {
		// 2는 소수
		if(num == 2) 
			return true;
		// 2 이상인 숫자는
		else if(num > 2) {
			// 2~제곱근범위를 반복하여 약수가 있는지 확인
			for(int i = 2; i<= Math.sqrt(num); i++) {
				if(num % i == 0) return false;
			}
			// 약수가 없으면 소수
			return true;
		}
		// 1은 소수가 아니다.
		return false;
	}
}
