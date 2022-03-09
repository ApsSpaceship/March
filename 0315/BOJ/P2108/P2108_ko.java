package Study_20220311_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_2108_통계학 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] nums = new int[N];
		int sum = 0;
		int[] freq = new int[8002]; //0, 양수 ~4000, 음수 4001~8001
		int fMax = -1;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			nums[i] = sc.nextInt();
			sum += nums[i];
			int fIdx = nums[i]; //빈도수 배열(freq) 인덱스
			
			if (nums[i] < 0) //음수면 양수로 바꾸고 +4000한 값을 인덱스로 사용
				fIdx = -fIdx + 4000;
			if (fMax < ++freq[fIdx]) { //새로운 최대 빈도수를 찾았다면 최댓값 변경
				list.clear(); //기존 리스트 비우고 추가
				list.add(nums[i]);
				fMax = freq[fIdx];
			} else if (fMax == freq[fIdx]) //빈도수가 같으면 기존 리스트에 추가
				list.add(nums[i]);
		}
		
		//정렬
		Arrays.sort(nums);
		Collections.sort(list);
		
    //출력
		System.out.println(Math.round((double) sum / N)); //반올림한 평균
		System.out.println(nums[N / 2]); //중간값
		System.out.println((list.size() > 1) ? list.get(1) : list.get(0)); //빈도수 같은게 있다면 2번째 작은 수
		System.out.println(nums[N - 1] - nums[0]); //최댓값-최솟값
	}

}
