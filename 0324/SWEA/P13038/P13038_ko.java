import java.util.ArrayList;
import java.util.Scanner;

public class SWEA_13038_교환학생 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = sc.nextInt();// 들어야되는 수업 일 수
			ArrayList<Integer> list = new ArrayList<>();
			for (int i = 0; i < 7; i++)
				if (sc.nextInt() == 1)
					list.add(i + 1); // 수업 있는 날 인덱스 저장

			int ans = 0;
			int size = list.size();
			int min = 7000000;

			for (int i = 0; i < size; i++) { // - 맨 첫 요일 앞 일 수 + 7로 떨어지는 날짜 수 + 남은 요일 수
				int last = (list.get((n + i - 1) % size)); //남은 요일 수
				ans = -(list.get(i) - 1) + ((n + i - 1) / size) * 7 + last;
				min = Math.min(min, ans);
			}

			System.out.println("#" + tc + " " + min);
		}
	}
}
