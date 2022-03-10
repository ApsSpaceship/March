
public class P1970 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			// 금액
			int amount = sc.nextInt();
			// 각 단위 별 돈 개수
			int[] cntArr = new int[8];
			// 인덱스
			int idx = 0;
			// 단위
			int unit = 50000;
			// 각 단위 별 개수 구하기
			while(idx != 8) {
				// 다 구하면 반복 중단
				if(idx == 8) break;
				// 단위별 개수 = 금액을 단위로 나눈 몫
				cntArr[idx] = amount/unit;
				// 새 금액은 금액을 단위로 나눈 나머지
				amount = amount % unit;
				// 인덱스가 짝수이면 5로 나누고
				if(idx % 2 == 0)
					unit /= 5;
				// 홀수 이면 2로 나눈다.
				else
					unit /= 2;
				// 인덱스 증가
				idx++;
			}
			// 출력
			System.out.println("#"+tc);
			for(int i = 0; i < 8; i++) {
				System.out.print(cntArr[i]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
