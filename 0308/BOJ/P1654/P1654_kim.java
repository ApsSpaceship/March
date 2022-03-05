package study_0308;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class baekjoon_1654_랜선자르기5 {
	static long max;
	static long ans;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		StringTokenizer st = new StringTokenizer(a);
		int k = Integer.parseInt(st.nextToken()); // 가지고 있는 랜선의 개수
		int n = Integer.parseInt(st.nextToken()); // 필요한 랜선의 개수
		int[] line = new int[k];
		long sum = 0;
		for(int i = 0; i < line.length; i++) {
			line[i] = Integer.parseInt(br.readLine());
			sum += line[i];			
		}
	    max =(sum / n); // 가상 최대 길이
	    ans = 0;
	    check(n, line);
	    System.out.println(ans);
	}
	static void check(int n, int[] line) {
		int count = 0;
		long st =1; // 최소길이
		long ed =max; // 최대길이
		while(st <= ed) {
			count = 0;
			long mid = (st+ed) / 2;
			for(int i = 0; i < line.length; i++) {
				count += (line[i] / mid);
			}
			if(count < n) {
				ed = mid-1;
			}else if(n <= count) {
				ans = mid; // ans에 값 저장.
				st = mid +1;
			}
		}
	}
}
