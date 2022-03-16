package study_0317;

import java.util.Scanner;

public class swea_11856_반반 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int tn = 1; tn <= tc; tn++) {
			String word = sc.next();
			String ans = "No";
	        int[] arr = new int[43]; // Z가 42라 43까지 배열 만듦
	        for(int i = 0; i < word.length(); i++) {
	        	arr[word.charAt(i)-'0']++; //알파벳을 숫자로 바꾸고 인덱스로 사용함
	        }
	        int check = 0;
	        //A가 17이라 17부터 체크시작
	        for(int i = 17; i < arr.length; i++) {
	        	if(arr[i] == 2) {
	        		check++;
	        	}
	        }
	        if(check == 2) {
	        	ans = "Yes";
	        }
	        System.out.println("#"+tn+" "+ans);
		}
	}

}
