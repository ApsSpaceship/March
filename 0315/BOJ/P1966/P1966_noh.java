import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력 받기
		int t = sc.nextInt();
		for (int tc = 1; tc <= t; ++tc) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr[] = new int[n];
			int cnt[] = new int[10];// 중요도의 개수
			int maxV = 0;
			for (int i = 0; i < n; ++i) {
				arr[i] = sc.nextInt();
				++cnt[arr[i]];
				maxV = Math.max(maxV, arr[i]);
			}

			// 구하려는 중요도가 가장 클때
			if (maxV == arr[m]) {
				int ans = 0;
				for (int i = 0; i < n; ++i)
					if (i <= m && arr[i] == arr[m])
						++ans;
				System.out.println(ans);
				continue;
			}

			// 구하려는 중요도보다 큰것중에 가장 작은 중요도의 마지막 인덱스 구하기
			int impo = arr[m];// 구하려는 중요도
			int cntImpo = 1;// impo 중 순서 구하기
			int big = 0;// impo 보다 크면서 가장 작은 중요도
			

			// big 구하기
			for (int i = impo + 1; i <= 9; ++i)
				if (cnt[i] != 0) {
					big = i;
					break;
				}

			// idx 구하기
			int idx = -1;
			int pArr = n - 1;
			int pCnt = maxV;
			while (!(pCnt == big && arr[pArr] == big)) {//
				if (arr[pArr] == pCnt) {
					--pCnt;
					while (cnt[pCnt] == 0) {
						--pCnt;
					}
				}
				if (pArr == 0)
					pArr = n - 1;
				else
					--pArr;
			}
			idx = pArr;

			// idx 이후로 몇번째 impo인지 구하기
			while (idx != m) {//
				if (arr[idx] == impo)
					++cntImpo;
				idx = (idx + 1) % n;
			}

			// 정답 구하기
			int ans = 0;
			for (int i = impo + 1; i <= 9; ++i)
				ans += cnt[i];
			ans += cntImpo;

			System.out.println(ans);
		}
	}
}
