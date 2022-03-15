package study_0317;

import java.util.Scanner;

public class swea_9839_최고의쌍 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int tn = 1; tn <= tc; tn++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			int max = -1;
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr.length; j++) {
					//두 숫자가 다르면서
					if(i != j) {
						int multi = arr[i] * arr[j];
						String num = Integer.toString(multi);
						boolean flag = true;
						for(int k = 0; k < num.length()-1; k++) {
							//숫자가 1씩 증가해야 하므로 증가하지 않으면 false로 바꾸고 break;
							if(num.charAt(k+1)!=(num.charAt(k)+1)) {
								flag = false;
								break;
							}
						}
						if(flag) {
							max = Math.max(max, multi);
						}
						
					}
				}
			}
			if(n == 1) max = -1; //n = 1이면 -1
			System.out.println("#"+tn+" "+max);
		}
	}
}
