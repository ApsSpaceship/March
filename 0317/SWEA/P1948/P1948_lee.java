import java.util.Scanner;

public class P1948 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
      // 입력 받을 값
			int m1, d1, m2, d2, ans = 0;
			m1 = sc.nextInt();
			d1 = sc.nextInt();
			m2 = sc.nextInt();
			d2 = sc.nextInt();
      // 월이 같으면
			if(m1 == m2) {
        // 일의 차 +1
				ans = d2 - d1+1;
			}else {
        //월의 일 수를 구하고 거기서 일의 차 +1
				ans += getDays(m1)-d1+1;
        // 월 마다의 일 수를 구하여 더한다.
				for(int m = m1+1; m < m2; m++) {
					ans += getDays(m);
				}
        // 마지막은 일 수 더하기
				ans += d2;
			}
			System.out.println("#"+tc+" "+ ans);
		}
		sc.close();
	}
  //월 별 일 수 구하기
	public static int getDays(int month) {
		int days = 0;
		switch(month) {
		case 1:
			days = 31;
			break;
		case 2:
			days = 28;
			break;
		case 3:
			days = 31;
			break;
		case 5:
			days = 31;
			break;
		case 7:
			days = 31;
			break;
		case 8:
			days = 31;
			break;
		case 10:
			days = 31;
			break;
		case 12:
			days = 31;
			break;
		default:
			days = 30;
			break;
		}
		return days;
	}
}
