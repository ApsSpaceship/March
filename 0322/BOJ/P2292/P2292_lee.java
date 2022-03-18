import java.util.Scanner;

public class P2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    		// 입력받은 N
		int N = sc.nextInt();
    		// 지나게 되는 방 개수
		int cnt = 1;
    		// 육각형 마다의 마지막 번호
		int num = 1;
		while (true) {
     		 	// 육각형의 마지막 번호보다 작거나 같으면 멈춘다.
			if(num >= N)
				break;
      			// 육각형의 마지막 번호는 6의 배수로 증가
			num += 6 * cnt;
      			// 육각형 하나를 지나면 지나게 되는 방 개수 증가
			cnt++;
		}
    		// 출력
		System.out.println(cnt);
		sc.close();
	}
}
