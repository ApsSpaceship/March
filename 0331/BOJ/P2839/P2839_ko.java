import java.util.Scanner;

public class BOJ_2839_설탕배달 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();// 설탕N킬로그램배달
		int five = N / 5; // 5kg봉지개수
		int last = N % 5; // 5kg봉지 뺀 무게
		while (last <= N && last % 3 != 0) { // last가 3으로 나눠 떨어질때까지
			five--;
			last += 5;
		}
		if(last>N)
			System.out.print(-1);
		else
			System.out.print(five + last / 3);
	}
  
}
