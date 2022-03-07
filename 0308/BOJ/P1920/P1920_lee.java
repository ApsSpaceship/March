import java.util.Arrays;
import java.util.Scanner;

public class P1920 {
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// N 개의 정수로, 1번부터 N번까지 존재하므로 +1;
		int N = sc.nextInt();
		arr = new int[N+1];
		arr[0] = Integer.MIN_VALUE;
		for(int i = 1; i < N+1; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		// 찾아야 하는 숫자 개수
		int M = sc.nextInt();
		for(int i =0; i < M; i++) {
			System.out.println(binarySearch(sc.nextInt(), 1, N));
		}
		sc.close();
	}
	// 이진 탐색(재귀적 호출)
	static int binarySearch(int key, int stIdx, int edIdx) {
		// 중간인덱스 
		int midIdx;
		// 시작 인덱스가 끝 인덱스와 같거나 그보다 작을때는 탐색 가능
		while(stIdx <= edIdx) {
			midIdx = (stIdx + edIdx) / 2;
			
			if(key == arr[midIdx]) { // 탐색 성공 
				return 1;
				// 찾고자 하는 키값이 중간 값보다 작을 때는 중간값 기준 왼쪽 탐색
			} else if(key < arr[midIdx]) {
				return binarySearch(key ,stIdx, midIdx-1);
			} 
			// 찾고자 하는 키값이 중간 값보다 클 때는 중간값 기준 오른쪽 탐색
			else {
				return binarySearch(key, midIdx+1, edIdx); 
			}
		}
		// 시작 인덱스가 끝 인덱스보다 작아지면 탐색 결과, 키값이 없음을 의미한다.
		return 0;
	}
}
