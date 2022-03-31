import java.util.Scanner;

public class bj_2839_설탕배달 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sugar = sc.nextInt();

		int ans = -1;

		if (sugar < 5) {
			if (sugar == 3)
				ans = 1;
		} else if (sugar % 5 == 0) {
			ans = sugar / 5;
		
		} else if(sugar % 5 == 3) {
			
			ans = sugar /5 +1 ;
			
		} else {
			
			for(int i =1; sugar/5-i >= 0 ;i++) {
				
				if((sugar%5+5*i)% 3 == 0) {
					
					ans = (sugar/5-i) + (sugar%5+5*i)/3;
					break;
				}
			}

		}

		System.out.println(ans);

	}
}
