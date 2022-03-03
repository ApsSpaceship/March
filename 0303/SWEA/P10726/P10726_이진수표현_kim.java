package study_0303;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SWEA_10726_이진수표현 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		for (int tn = 1; tn <= tc; tn++) {
			int check = sc.nextInt(); // 마지막 n개의 비트가 켜져 있어야 함
			int num = sc.nextInt();
			while (num > 0) {
				queue.add(num % 2); // 가장 마지막 비트부터 queue에 들어간다.
				num = num / 2;
			}
			int count = 0;
			String ans = "ON";
			out: while (true) {
				for (int i = 0; i < check; i++) {
					if (queue.isEmpty() || queue.poll() != 1) {
						ans = "OFF";
						break out;
					} else {
						count++;
					}
				}
				break out;
			}
			if (count != check) {
				ans = "OFF";
			}
			System.out.println("#" + tn + " " + ans);
			queue.clear();
		}
	}
}
