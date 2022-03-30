package study_0329;

import java.util.Scanner;

public class baekjoon_P2806_나무자르기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 나무 수
		int m = sc.nextInt(); // 필요한 나무 길이
		int max = 0; // 제일 높은 나무 길이
		int[] tree = new int[n];
		for(int i = 0; i < n; i++) {
			tree[i] = sc.nextInt();
			max = Math.max(max,tree[i]);
		}
		long ans = max;
		long st = 0;
		long ed = max;
		//이진탐색 시작!
		while(st<=ed) {
			long mid = (st+ed)/2;
			long sum = 0;
			for(int i = 0; i < tree.length; i++) {
				if(tree[i] > mid) {
					sum += (tree[i]-mid);
				}
			}
					
			if(sum < m) {
				ed = mid-1; // 필요한 나무 길이보다 합이 작으면 더 낮은 높이에서 잘라야 하므로  ed를 이동
			}else {
				ans= mid;
				st = mid+1; // 필요한 나무 길이보다 합이 크거나 같으면 더 높은 높이에서 잘라야 하므로 st를 이동
			}
		}
		
		System.out.println(ans);
	}

}
