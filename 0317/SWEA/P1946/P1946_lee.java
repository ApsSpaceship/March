import java.util.Scanner;

public class P1946 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		for(int tc =1; tc <= T; tc++) {
			sb.setLength(0);
			// 알파벳과 숫자 쌍 개수 입력
			int N = sc.nextInt();
			// 반복
			for(int i =0; i < N; i++) {
				// 알파벳
				String alphabet = sc.next();
				// 개수
				int cnt = sc.nextInt();
				// 개수만큼 알파벳 스트링빌더에 더해주기
				for(int j = 0; j < cnt; j++) {
					sb.append(alphabet);
				}
			}
			// 스트링빌더를 스트링으로
			String str = sb.toString();
			// 길이
			int length = str.length();
			// 테스트 케이스번호 출력
			System.out.println("#"+tc);
			// 자르기 시작할 위치 인덱스
			int st = 0;
			// 입력받은 길이가 10보다 작을 때 그냥 출력
			if(length <= 10) {
				System.out.println(str.substring(st));
			}else {
				// 10 초과이면
				while(true) {
					// 인덱스 넘어가는지 확인 -> 넘어가면 바로 출력하고 멈춤
					if(st+10 >= length) {
						System.out.println(str.substring(st));
						break;
					}
					// 시작 인덱스부터 10글자 출력
					System.out.println(str.substring(st, st+10));
					// 시작인덱스 변경
					st += 10;
				}
			}		
		}
		sc.close();
	}
}
