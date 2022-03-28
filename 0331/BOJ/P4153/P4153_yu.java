import java.util.Arrays;
import java.util.Scanner;

public class bj_4153_직각삼각형 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			int[] tri = new int[3];

			for (int i = 0; i < 3; i++) {

				tri[i] = sc.nextInt();
			}

			Arrays.sort(tri);
			
			// 피타고라스의 정리 이용

			if (tri[0] == 0 && tri[1] == 0 && tri[2] == 0) {
				break;
			}

			int a = tri[0] * tri[0];
			int b = tri[1] * tri[1];
			int c = tri[2] * tri[2];

			if (a + b == c) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}

		}

	}

}
