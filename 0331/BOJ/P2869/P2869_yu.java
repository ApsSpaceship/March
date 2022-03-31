import java.util.Scanner;

public class bj_2869_달팽이는올라가고싶다 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int day = sc.nextInt();

		int night = sc.nextInt();

		int top = sc.nextInt();

		int gap = day - night;

		int	cnt = (top - day) / gap + 1;

		if((top - day) % gap != 0) cnt++;
	
	
		System.out.println(cnt);
	}
}
