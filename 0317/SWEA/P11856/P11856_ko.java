package Study_20220311_17;

import java.util.HashSet;
import java.util.Scanner;

public class SWEA_11856_반반 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			char[] text = sc.next().toCharArray();
			HashSet<Character> s = new HashSet<>(); //중복제거
			for (int i = 0; i < 4; i++)
				s.add(text[i]);
			
			//셋에 2개 들어있으면 Yes
			System.out.printf("#%d %s\n", tc, (s.size() == 2) ? "Yes" : "No");
		}
	}
}
